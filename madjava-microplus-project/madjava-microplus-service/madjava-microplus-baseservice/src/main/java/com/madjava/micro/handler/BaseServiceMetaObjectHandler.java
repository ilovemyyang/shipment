package com.madjava.micro.handler;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.madjava.micro.data.ThreadLocalData;
import com.madjava.micro.service.SessionService;

@Component
public class BaseServiceMetaObjectHandler implements MetaObjectHandler {

	@Resource(name = "sessionService")
	private SessionService sessionService;
	
	@Override
    public void insertFill(MetaObject metaObject) {
        Date now = new Date();
        ThreadLocalData threadLocalData = sessionService.getSessionData().get();
        this.strictInsertFill(metaObject, "createUser", String.class, StringUtils.isEmpty(threadLocalData.getUserName()) ? "anonymous" : threadLocalData.getUserName());
        this.strictInsertFill(metaObject, "createTime", Date.class, now); 
        this.strictInsertFill(metaObject, "updateUser", String.class, StringUtils.isEmpty(threadLocalData.getUserName()) ? "anonymous" : threadLocalData.getUserName());
        this.strictInsertFill(metaObject, "updateTime", Date.class, now);
        this.strictInsertFill(metaObject, "deleted", Integer.class, 0); 
        this.strictInsertFill(metaObject, "version", Integer.class, 1);
        this.strictInsertFill(metaObject, "tenantCode", String.class, "shipment");
    }

    @Override
    public void updateFill(MetaObject metaObject) {
    	ThreadLocalData threadLocalData = sessionService.getSessionData().get();
        this.strictUpdateFill(metaObject, "updateUser", String.class, StringUtils.isEmpty(threadLocalData.getUserName()) ? "anonymous" : threadLocalData.getUserName());
        this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date()); 
    }

}
