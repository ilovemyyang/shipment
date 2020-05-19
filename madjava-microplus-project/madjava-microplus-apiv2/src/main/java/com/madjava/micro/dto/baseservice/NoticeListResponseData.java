package com.madjava.micro.dto.baseservice;

import java.io.Serializable;
import java.util.List;

import com.madjava.micro.dto.PageData;

public class NoticeListResponseData implements Serializable {

	private static final long serialVersionUID = -4347541443302716147L;

	
	private List<NoticeData> noticeDatas;
	
	private PageData pageData;

	public List<NoticeData> getNoticeDatas() {
		return noticeDatas;
	}

	public void setNoticeDatas(List<NoticeData> noticeDatas) {
		this.noticeDatas = noticeDatas;
	}

	public PageData getPageData() {
		return pageData;
	}

	public void setPageData(PageData pageData) {
		this.pageData = pageData;
	}
	
}
