package com.madjava.micro.facade.baseservice;

import com.madjava.micro.dto.ResultData;
import com.madjava.micro.dto.baseservice.NoticeData;
import com.madjava.micro.dto.baseservice.NoticeListResponseData;
import com.madjava.micro.dto.baseservice.NoticeQueryData;

public interface NoticeFacade {
	public void addNotice(NoticeData noticeData,String userPk);
	
	public void updateNotice(NoticeData noticeData,String userPk);
	
	public void deleteByPk(String pk);
	
	public int setEnabled(String pk,Boolean enable,String userPk);
	
	public int setIsTop(String pk,Boolean isTop,String userPk);
	
	public NoticeData findByPk(String pk);
	
	public ResultData<NoticeListResponseData> selectByQuery(NoticeQueryData noticeQueryData);
}
