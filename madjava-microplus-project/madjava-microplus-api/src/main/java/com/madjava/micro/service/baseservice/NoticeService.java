package com.madjava.micro.service.baseservice;

import java.util.List;

import com.madjava.micro.dto.baseservice.NoticeQueryData;
import com.madjava.micro.model.baseservice.Notice;
import com.madjava.micro.service.base.BaseService;

/**
 * 
 *
 * @author zhengquan.xu
 * @email  zhengquan.xu@accenture.com
 * @date 2020-04-08
 */
public interface NoticeService extends BaseService<Notice> {
	public void addNotice(Notice notice,String userPk);
	
	public void updateNotice(Notice notice,String userPk);
	
	public void deleteByPk(String pk);
	
	public int setEnabled(String pk,Boolean enable,String userPk);
	
	public int setIsTop(String pk,Boolean isTop,String userPk);
	
	public Notice findByPk(String pk);
	/**
	 * 分页多字段模糊查询，按启用状态、置顶状态、优先级排序
	 * @param noticeQueryData
	 * @return
	 */
	public List<Notice> selectByQuery(NoticeQueryData noticeQueryData);
	
	public int selectByQueryCount(NoticeQueryData noticeQueryData);
	
}