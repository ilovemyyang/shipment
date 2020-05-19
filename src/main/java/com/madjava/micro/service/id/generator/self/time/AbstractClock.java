package com.madjava.micro.service.id.generator.self.time;

public abstract class AbstractClock {

  public static AbstractClock systemClock() {
    return new SystemClock();
  }

  public abstract long millis();

  private static final class SystemClock extends AbstractClock {

    public SystemClock() {
		}

		@Override
    public long millis() {
      return System.currentTimeMillis();
    }
  }
}
