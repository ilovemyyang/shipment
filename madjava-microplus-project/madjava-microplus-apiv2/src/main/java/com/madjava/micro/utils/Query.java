/**
 * Accenture Interactive
 *
 * Content Group
 *
 * Mybatis-plus demo
 */

package com.madjava.micro.utils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.util.StringUtils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.madjava.micro.dto.SortRequestData;


/**
 * 查询参数
 *
 * @author sheng.han
 */
public class Query<T> {

    public IPage<T> getPage(Map<String, Object> params) {
        return this.getPage(params, null, false);
    }

    public IPage<T> getPage(Map<String, Object> params, String defaultOrderField, boolean isAsc) {
        //分页参数
        long curPage = 1;
        long limit = 10;

        if(params.get(Constant.PAGE) != null){
            curPage = Long.parseLong(String.valueOf(params.get(Constant.PAGE)));
        }
        if(params.get(Constant.LIMIT) != null){
            limit = Long.parseLong(String.valueOf(params.get(Constant.LIMIT)));
        }

        //分页对象
        Page<T> page = new Page<>(curPage, limit);

        //分页参数
        params.put(Constant.PAGE, page);

        setSortParams(params,page,defaultOrderField,isAsc);
        
        return page;
    }
    
    @SuppressWarnings("unchecked")
	private void setSortParams(Map<String, Object> params,Page<T> page,String defaultOrderField, boolean isAsc) {
    	//排序字段
        //防止SQL注入（因为orderField、order是通过拼接SQL实现排序的，会有SQL注入风险）
    	final Object sortObject = params.get(Constant.ORDER_FIELD);
    	if(sortObject != null) {
    		if(sortObject instanceof List) {
        		final List<SortRequestData> sortRequestData = 
        				((List<SortRequestData>) sortObject).stream().filter(item->item != null)
        				.collect(Collectors.toList());
        		sortRequestData.stream().forEach(item->{
        			if(Constant.ASC.equalsIgnoreCase(item.getOperation())) {
                        page.addOrder(OrderItem.asc(item.getFieldName()));
                    }else {
                        page.addOrder(OrderItem.desc(item.getFieldName()));
                    }
        		});
        		return;
        	}else {
        		String orderField = SQLFilter.sqlInject((String)params.get(Constant.ORDER_FIELD));
                String order = (String)params.get(Constant.ORDER);

                //前端字段排序
                if(!StringUtils.isEmpty(orderField) && !StringUtils.isEmpty(order)){
                    if(Constant.ASC.equalsIgnoreCase(order)) {
                        page.addOrder(OrderItem.asc(orderField));
                        return;
                    }else {
                        page.addOrder(OrderItem.desc(orderField));
                        return;
                    }
                }
        	}
    	}
    	
    	//没有排序字段，则不排序
        if(!StringUtils.isEmpty(defaultOrderField)){
        	//默认排序
            if(isAsc) {
                page.addOrder(OrderItem.asc(defaultOrderField));
            }else {
                page.addOrder(OrderItem.desc(defaultOrderField));
            }
        }
    }
}
