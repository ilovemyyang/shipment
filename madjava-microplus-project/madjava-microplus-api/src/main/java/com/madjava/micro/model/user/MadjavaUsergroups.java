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
public class MadjavaUsergroups implements Serializable {

    private static final long serialVersionUID = -3823012059857458938L;

    /**
     */
    private String groupPk;

    /**
     */
    private String groupId;

    /**
     */
    private String groupName;

    /**
     */
    private String description;

    /**
     */
    private Long groupType;

    /**
     * 用户组权限
     */
    private String groupLevel;

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
     * @return the groupId
     */
    public String getGroupId() {

        return groupId;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param groupId the groupId to set
     */
    public void setGroupId(String groupId) {

        this.groupId = groupId;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the groupName
     */
    public String getGroupName() {

        return groupName;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {

        this.groupName = groupName;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the description
     */
    public String getDescription() {

        return description;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param description the description to set
     */
    public void setDescription(String description) {

        this.description = description;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the groupType
     */
    public Long getGroupType() {

        return groupType;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param groupType the groupType to set
     */
    public void setGroupType(Long groupType) {

        this.groupType = groupType;
    }

    /**
     * <pre>
     * 用户组权限
     * </pre>
     * 
     * @return the groupLevel
     */
    public String getGroupLevel() {

        return groupLevel;
    }

    /**
     * <pre>
     * 用户组权限
     * </pre>
     * 
     * @param groupLevel the groupLevel to set
     */
    public void setGroupLevel(String groupLevel) {

        this.groupLevel = groupLevel;
    }
}
