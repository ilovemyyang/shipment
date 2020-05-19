package com.madjava.micro.handler;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.madjava.micro.data.ThreadLocalData;
import com.madjava.micro.service.SessionService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ProductMetaObjectHandler implements MetaObjectHandler {

	@Resource(name = "sessionService")
	private SessionService sessionService;
	
	@Override
    public void insertFill(MetaObject metaObject) {
      //  log.info("start insert fill ....");
        Date now = new Date();
        
        ThreadLocalData threadLocalData = sessionService.getSessionData().get();
        
        this.strictInsertFill(metaObject, "createUser", String.class, StringUtils.isEmpty(threadLocalData.getUserName()) ? "anonymous" : threadLocalData.getUserName());
        this.strictInsertFill(metaObject, "createTime", Date.class, now); 
        this.strictInsertFill(metaObject, "updateUser", String.class, StringUtils.isEmpty(threadLocalData.getUserName()) ? "anonymous" : threadLocalData.getUserName());
        this.strictInsertFill(metaObject, "updateTime", Date.class, now);
        this.strictInsertFill(metaObject, "deleted", Integer.class, 0); 
    }

    @Override
    public void updateFill(MetaObject metaObject) {
    	ThreadLocalData threadLocalData = sessionService.getSessionData().get();
      //  log.info("start update fill ....");
        this.strictUpdateFill(metaObject, "updateUser", String.class, StringUtils.isEmpty(threadLocalData.getUserName()) ? "anonymous" : threadLocalData.getUserName());
        this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date()); 
    }

}
