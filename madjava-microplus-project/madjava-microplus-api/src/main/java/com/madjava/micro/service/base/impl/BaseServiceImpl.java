
package com.madjava.micro.service.base.impl;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.madjava.micro.dto.request.Query;
import com.madjava.micro.dto.request.QueryOperationEnum;
import com.madjava.micro.dto.request.QueryOperationParam;
import com.madjava.micro.dto.request.QueryParam;
import com.madjava.micro.dto.response.TableResultResponse;
import com.madjava.micro.enumtype.MessageEnum;
import com.madjava.micro.model.product.ProductChannel;
import com.madjava.micro.service.base.BaseService;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

public class BaseServiceImpl<M extends Mapper<T>, T> implements BaseService<T> {
	@Autowired
	protected M mapper;

	@Override
	public T selectOne(T entity) {
		return mapper.selectOne(entity);
	}

	@Override
	public T selectById(Object id) {
		return mapper.selectByPrimaryKey(id);
	}

//    @Override
//    public List<T> selectListByIds(List<Object> ids) {
//        return mapper.selectByIds(ids);
//    }

	@Override
	public List<T> selectList(T entity) {
		return mapper.select(entity);
	}

	@Override
	public List<T> selectListAll() {
		return mapper.selectAll();
	}

//    @Override
//    public Long selectCountAll() {
//        return mapper.selectCount();
//    }

	@Override
	public Long selectCount(T entity) {
		return Long.valueOf(mapper.selectCount(entity));
	}

	@Override
	public void insert(T entity) {
		mapper.insert(entity);
	}

	@Override
	public void insertSelective(T entity) {
		mapper.insertSelective(entity);
	}

	@Override
	public void delete(T entity) {
		mapper.delete(entity);
	}

	@Override
	public void deleteById(Object id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateById(T entity) {
		mapper.updateByPrimaryKey(entity);
	}

	@Override
	public void updateSelectiveById(T entity) {
		mapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public TableResultResponse<T> selectByQuery(Query query) {
		Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
		Example example = new Example(clazz);
		if (query.entrySet().size() > 0) {
			Example.Criteria criteria = example.createCriteria();
			for (Map.Entry<String, Object> entry : query.entrySet()) {
				criteria.andEqualTo(entry.getKey(), entry.getValue().toString());
			}
		}
		return getResultResponse(null,query, example);
	}
	
	@Override
	public TableResultResponse<T> selectPageByQueryParam(QueryParam params) {
		Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
		Example example = new Example(clazz);
		
		Map<String, Object> queryParams = params.getQueryParams();
		Map<String, Object> sortParams = params.getSortParams();
		
		Query query = new Query(queryParams);
		Example.Criteria criteria = null;
		if (query.entrySet().size() > 0) {
			criteria = example.createCriteria();
			for (Map.Entry<String, Object> entry : query.entrySet()) {
				if(!StringUtils.isEmpty(entry.getValue().toString())) {
					criteria.andEqualTo(entry.getKey(), entry.getValue().toString());
				}
			}
		}
		
		final List<QueryOperationParam> operations = params.getOperations();
		if(!CollectionUtils.isEmpty(operations)) {
			criteria = criteria != null ?  criteria : example.createCriteria();
			for(final QueryOperationParam operationParam:operations) {
				switch(operationParam.getOperation()) {
				case ANDNOTEQUAL: criteria.andNotEqualTo(operationParam.getKey(), operationParam.getValue());
					break;
				case ANDLIKE:criteria.andLike(operationParam.getKey(), operationParam.getValue().toString());
					break;
				case ANDBETWEEN:criteria.andBetween(operationParam.getKey(), operationParam.getValue(), operationParam.getValue2());
					break;
				case ORLIKE:criteria.orLike(operationParam.getKey(), "%"+operationParam.getValue().toString()+"%");
					break;
				case OREQUALTO:criteria.orEqualTo(operationParam.getKey(), operationParam.getValue().toString());
					break;
				default:
					break;
				}
			}
		}
		
		criteria = criteria != null ?  criteria : example.createCriteria();
		addCriteria(params,criteria);
		
		if (sortParams != null && sortParams.entrySet().size() > 0) {
			for (Map.Entry<String, Object> entry : sortParams.entrySet()) {
				if("desc".equals(entry.getValue().toString())) {
					example.orderBy(entry.getKey()).desc();
				} else {
					example.orderBy(entry.getKey()).asc();
				}
			}
		}
		return getResultResponse(params,query, example);
	}

	protected Example.Criteria addCriteria( final QueryParam params, final Example.Criteria criteria ){
		return criteria;
	}
	
	protected TableResultResponse<T> getResultResponse(QueryParam param, Query query, Example example) {
		Page<Object> result = PageHelper.startPage(query.getPageNo(), query.getPageSize());
		List<T> list = mapper.selectByExample(example);
		return new TableResultResponse<T>(result.getTotal(), list, MessageEnum.SUCCESS);
	}
	
	protected List<QueryOperationParam> addOperation(List<QueryOperationParam> list, Map<String, Object> map, List<String> keys) {
		List<QueryOperationParam> operations;
		if(list==null){
			operations=new ArrayList<>();
		}else{
			operations=new ArrayList<>(list);
		}
		for(String key:keys){
			addQueryOperationParam(map, operations,key);
		}
		return operations;
	}

	protected void addQueryOperationParam(Map<String, Object> map, List<QueryOperationParam> operations, String key) {
		if(map.containsKey(key)){
			if(!ObjectUtils.isEmpty(map.get(key))){
				String productCodes=(String) (map.get(key));
				for(String productCode:productCodes.split(",")){
					QueryOperationParam queryOperationParam=new QueryOperationParam();
					queryOperationParam.setKey(key);
					queryOperationParam.setValue(productCode);
					queryOperationParam.setOperation(QueryOperationEnum.ORLIKE);
					operations.add(queryOperationParam);
				}
			}
			map.remove(key);
		}
	}
	
	@Override
	public List<T> selectByExample(Object example) {
		return mapper.selectByExample(example);
	}

	@Override
	public List<T> selectByQueryParam(QueryParam params) {
		Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
		Example example = new Example(clazz);
		Map<String, Object> queryParams = params.getQueryParams();
		Map<String, Object> sortParams = params.getSortParams();
		if (queryParams != null && queryParams.entrySet().size() > 0) {
			Example.Criteria criteria = example.createCriteria();
			for (Map.Entry<String, Object> entry : queryParams.entrySet()) {
				criteria.andEqualTo(entry.getKey(), entry.getValue().toString());
			}
		}
		if (sortParams != null && sortParams.entrySet().size() > 0) {
			for (Map.Entry<String, Object> entry : sortParams.entrySet()) {
				if("desc".equals(entry.getValue().toString())) {
					example.orderBy(entry.getKey()).desc();
				} else {
					example.orderBy(entry.getKey()).asc();
				}
			}
		}
		return mapper.selectByExample(example);
	}

//    @Override
//    public void deleteBatchByIds(List<Object> ids) {
//        mapper.batchDeleteByIds(ids);
//    }
//
//    @Override
//    public void updateBatch(List<T> entitys) {
//        mapper.batchUpdate(entitys);
//    }
}

