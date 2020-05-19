package com.madjava.micro.service.config;

import java.util.List;

import com.madjava.micro.model.config.MadjavaRandompwd;

public interface MadjavaRandompwdService {

	/**
     * 插入
     * 
     * @param madjavaRandompwd
     * @return returnCode
     */
    int insert(MadjavaRandompwd madjavaRandompwd);

    /**
     * 删除通过主键 <br>
     * PrimaryKey: cellphone, userType
     * 
     * @param madjavaRandompwd
     * @return returnCode
     */
    int deleteByPrimaryKey(MadjavaRandompwd madjavaRandompwd);

    /**
     * 单件更新通过主键(全更新) <br>
     * PrimaryKey: cellphone, userType
     * 
     * @param madjavaRandompwd
     * @return returnCode
     */
    int updateAllByPrimaryKey(MadjavaRandompwd madjavaRandompwd);

    /**
     * 单件更新通过主键(部分更新) <br>
     * PrimaryKey: cellphone, userType
     * 
     * @param madjavaRandompwd
     * @return returnCode
     */
    int updateByPrimaryKey(MadjavaRandompwd madjavaRandompwd);

    /**
     * 单件检索通过主键 <br>
     * PrimaryKey: cellphone, userType
     * 
     * @param madjavaRandompwd
     * @return madjavaRandompwd
     */
    MadjavaRandompwd selectOneByPrimaryKey(MadjavaRandompwd madjavaRandompwd);

    /**
     * 检索列表
     * 
     * @param madjavaRandompwd
     * @return madjavaRandompwdList
     */
    List<MadjavaRandompwd> selectList(MadjavaRandompwd madjavaRandompwd);

    /**
     * 检索件数
     * 
     * @param madjavaRandompwd
     * @return count
     */
    int selectCount(MadjavaRandompwd madjavaRandompwd);
    
    /**
     * @param madjavaRandompwd
     * @return
     */
    MadjavaRandompwd selectOneByTimeAndPk(MadjavaRandompwd madjavaRandompwd);
}
