package com.madjava.micro.dto.baseservice;

import com.github.pagehelper.PageInfo;

import lombok.Data;

@Data public class Pageable<T extends ItemData> extends BaseItemData {

	private static final long	serialVersionUID	= -6008411830591213914L;
	
	private PageInfo<T> pageData;
}
