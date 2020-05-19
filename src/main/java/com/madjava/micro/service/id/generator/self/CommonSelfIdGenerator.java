package com.madjava.micro.service.id.generator.self;

import java.util.Calendar;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.madjava.micro.service.id.generator.IdGenerator;
import com.madjava.micro.service.id.generator.self.time.AbstractClock;

class CommonSelfIdGenerator implements IdGenerator {

  public static final long     SJDBC_EPOCH;

  private static final long    SEQUENCE_BITS             = 12L;

  private static final long    WORKER_ID_BITS            = 10L;

  private static final long    SEQUENCE_MASK             = (1 << SEQUENCE_BITS) - 1;

  private static final long    WORKER_ID_LEFT_SHIFT_BITS = SEQUENCE_BITS;

  private static final long    TIMESTAMP_LEFT_SHIFT_BITS = WORKER_ID_LEFT_SHIFT_BITS + WORKER_ID_BITS;

  private static final long    WORKER_ID_MAX_VALUE       = 1L << WORKER_ID_BITS;

  private static AbstractClock clock                     = AbstractClock.systemClock();

  private static long          workerId;

  static {
    final Calendar calendar = Calendar.getInstance();
    calendar.set(2016, Calendar.NOVEMBER, 1);
    calendar.set(Calendar.HOUR_OF_DAY, 0);
    calendar.set(Calendar.MINUTE, 0);
    calendar.set(Calendar.SECOND, 0);
    calendar.set(Calendar.MILLISECOND, 0);
    SJDBC_EPOCH = calendar.getTimeInMillis();
    initWorkerId();
  }

  private long sequence;

  private long lastTime;

  public static long getWorkerId() {
    return workerId;
  }

  public static void setClock(final AbstractClock clock) {
    CommonSelfIdGenerator.clock = clock;
  }

  static void initWorkerId() {
    String workerId = System.getProperty("sjdbc.self.id.generator.worker.id");
    if (!Strings.isNullOrEmpty(workerId)) {
      setWorkerId(Long.valueOf(workerId));
      return;
    }
    workerId = System.getenv("SJDBC_SELF_ID_GENERATOR_WORKER_ID");
    if (Strings.isNullOrEmpty(workerId)) {
      return;
    }
    setWorkerId(Long.valueOf(workerId));
  }

  @SuppressWarnings("boxing") public static void setWorkerId(final Long workerId) {
    Preconditions.checkArgument(workerId >= 0L && workerId < WORKER_ID_MAX_VALUE);
    CommonSelfIdGenerator.workerId = workerId;
  }

  @Override
  public synchronized long generateId() {
    long time = clock.millis();
    Preconditions.checkState(this.lastTime <= time,
        "Clock is moving backwards, last time is %d milliseconds, current time is %d milliseconds", this.lastTime,
        time);
    if (this.lastTime == time) {
      if (0L == (this.sequence = ++this.sequence & SEQUENCE_MASK)) {
        time = waitUntilNextTime(time);
      }
    } else {
      this.sequence = 0;
    }
    this.lastTime = time;
    return time - SJDBC_EPOCH << TIMESTAMP_LEFT_SHIFT_BITS | workerId << WORKER_ID_LEFT_SHIFT_BITS | this.sequence;
  }

  private static long waitUntilNextTime(final long lastTime) {
    long time = clock.millis();
    while (time <= lastTime) {
      time = clock.millis();
    }
    return time;
  }
}
