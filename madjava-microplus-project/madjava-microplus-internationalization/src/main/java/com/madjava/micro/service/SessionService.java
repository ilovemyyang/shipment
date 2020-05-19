package com.madjava.micro.service;

import java.util.Optional;

import com.madjava.micro.data.ThreadLocalData;

public interface SessionService {
	
	void setSessionData(ThreadLocalData value);

    Optional<ThreadLocalData> getSessionData();
    
    void remove();

}
