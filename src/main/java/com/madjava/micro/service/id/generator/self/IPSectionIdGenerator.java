package com.madjava.micro.service.id.generator.self;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Service;

import com.madjava.micro.service.id.generator.IdGenerator;

@Service
public class IPSectionIdGenerator implements IdGenerator {

  private final CommonSelfIdGenerator commonSelfIdGenerator = new CommonSelfIdGenerator();

  static {
    initWorkerId();
  }

  @SuppressWarnings("boxing") static void initWorkerId() {
    InetAddress address;
    try {
      address = InetAddress.getLocalHost();
    } catch (final UnknownHostException e) {
      throw new IllegalStateException("Cannot get LocalHost InetAddress, please check your network!", e);
    }
    final byte[] ipAddressByteArray = address.getAddress();
    long workerId = 0L;
    switch (ipAddressByteArray.length) {
    case 4:
      for (final byte byteNum : ipAddressByteArray) {
        workerId += byteNum & 0xFF;
      }
      break;
    case 16:
      for (final byte byteNum : ipAddressByteArray) {
        workerId += byteNum & 0B111111;
      }
      break;
    default:
      throw new IllegalStateException("Bad LocalHost InetAddress, please check your network!");
    }
    CommonSelfIdGenerator.setWorkerId(workerId);
  }

  @Override
  public long generateId() {
    return this.commonSelfIdGenerator.generateId();
  }
}