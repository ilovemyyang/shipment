package com.madjava.micro.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.madjava.micro.data.ThreadLocalData;
import com.madjava.micro.service.SessionService;

@Component(value = "sessionService")
public class SessionServiceImpl implements SessionService {
	
	private static final ThreadLocal<ThreadLocalData> sessionDataThreadLocal = new ThreadLocal<>();

	@Override
	public void setSessionData(ThreadLocalData value) {
		sessionDataThreadLocal.set(value);
	}

	@Override
	public Optional<ThreadLocalData> getSessionData() {
		return Optional.ofNullable(sessionDataThreadLocal.get());
	}

	@Override
	public void remove() {
		sessionDataThreadLocal.remove();
	}

}
