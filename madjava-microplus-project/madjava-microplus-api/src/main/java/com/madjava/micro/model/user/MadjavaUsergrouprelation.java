package com.madjava.micro.model.user;

import java.io.Serializable; 
/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 * @author madjava-
 */
public class MadjavaUsergrouprelation implements Serializable {

    private static final long serialVersionUID = -7753917526311789824L;

    /**
     */
    private String groupPk;

    /**
     */
    private String userPk;

    /**
     * <pre>
     * </pre>
     * 
     * @return the groupPk
     */
    public String getGroupPk() {

        return groupPk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param groupPk the groupPk to set
     */
    public void setGroupPk(String groupPk) {

        this.groupPk = groupPk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the userPk
     */
    public String getUserPk() {

        return userPk;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param userPk the userPk to set
     */
    public void setUserPk(String userPk) {

        this.userPk = userPk;
    }
}
