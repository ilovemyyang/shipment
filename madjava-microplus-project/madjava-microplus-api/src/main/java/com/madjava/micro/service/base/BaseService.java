package com.madjava.micro.service.base;

import java.util.List;
import java.util.Map;

import com.madjava.micro.dto.request.Query;
import com.madjava.micro.dto.request.QueryParam;
import com.madjava.micro.dto.response.TableResultResponse;

public interface BaseService<T> {
    /**
     * 查询
     *
     * @param entity
     * @return
     */
    T selectOne(T entity);

    /**
     * 通过Id查询
     *
     * @param id
     * @return
     */
    T selectById(Object id);

    /**
     * 根据ID集合来查询
     *
     * @param ids
     * @return
     */
//    List<T> selectListByIds(List<Object> ids);

    /**
     * 查询列表
     *
     * @param entity
     * @return
     */
    List<T> selectList(T entity);


    /**
     * 获取所有对象
     *
     * @return
     */
    List<T> selectListAll();


    /**
     * 查询总记录数
     *
     * @return
     */
//    Long selectCountAll();

    /**
     * 查询总记录数
     *
     * @param entity
     * @return
     */
    Long selectCount(T entity);

    /**
     * 添加
     *
     * @param entity
     */
    void insert(T entity);


    /**
     * 插入 不插入null字段
     *
     * @param entity
     */
    void insertSelective(T entity);

    /**
     * 删除
     *
     * @param entity
     */
    void delete(T entity);

    /**
     * 根据Id删除
     *
     * @param id
     */
    void deleteById(Object id);


    /**
     * 根据id更新
     *
     * @param entity
     */
    void updateById(T entity);


    /**
     * 不update null
     *
     * @param entity
     */
    void updateSelectiveById(T entity);

    /**
     * 根据ID集合批量删除
     *
     * @param ids
     */
//    void deleteBatchByIds(List<Object> ids);


    /**
     * 批量更新
     *
     * @param entitys
     */
//    void updateBatch(List<T> entitys);
    
    public TableResultResponse<T> selectByQuery(Query query);
    
    public TableResultResponse<T> selectPageByQueryParam(QueryParam params);
    
    public List<T> selectByExample(Object example);
    
    public List<T> selectByQueryParam(QueryParam params);
}
