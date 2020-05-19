package com.madjava.micro.model.admin;

import java.util.Date;
import javax.persistence.*;

@Table(name = "gate_log")
public class GateLog {
    /**
     * 序号
     */
    @Id
    private Integer id;

    /**
     * 菜单
     */
    private String menu;

    /**
     * 操作
     */
    private String opt;

    /**
     * 资源路径
     */
    private String uri;

    /**
     * 操作时间
     */
    @Column(name = "crt_time")
    private Date crtTime;

    /**
     * 操作人ID
     */
    @Column(name = "crt_user")
    private String crtUser;

    /**
     * 操作人
     */
    @Column(name = "crt_name")
    private String crtName;

    /**
     * 操作主机
     */
    @Column(name = "crt_host")
    private String crtHost;

    /**
     * 获取序号
     *
     * @return id - 序号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置序号
     *
     * @param id 序号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取菜单
     *
     * @return menu - 菜单
     */
    public String getMenu() {
        return menu;
    }

    /**
     * 设置菜单
     *
     * @param menu 菜单
     */
    public void setMenu(String menu) {
        this.menu = menu;
    }

    /**
     * 获取操作
     *
     * @return opt - 操作
     */
    public String getOpt() {
        return opt;
    }

    /**
     * 设置操作
     *
     * @param opt 操作
     */
    public void setOpt(String opt) {
        this.opt = opt;
    }

    /**
     * 获取资源路径
     *
     * @return uri - 资源路径
     */
    public String getUri() {
        return uri;
    }

    /**
     * 设置资源路径
     *
     * @param uri 资源路径
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * 获取操作时间
     *
     * @return crt_time - 操作时间
     */
    public Date getCrtTime() {
        return crtTime;
    }

    /**
     * 设置操作时间
     *
     * @param crtTime 操作时间
     */
    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    /**
     * 获取操作人ID
     *
     * @return crt_user - 操作人ID
     */
    public String getCrtUser() {
        return crtUser;
    }

    /**
     * 设置操作人ID
     *
     * @param crtUser 操作人ID
     */
    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser;
    }

    /**
     * 获取操作人
     *
     * @return crt_name - 操作人
     */
    public String getCrtName() {
        return crtName;
    }

    /**
     * 设置操作人
     *
     * @param crtName 操作人
     */
    public void setCrtName(String crtName) {
        this.crtName = crtName;
    }

    /**
     * 获取操作主机
     *
     * @return crt_host - 操作主机
     */
    public String getCrtHost() {
        return crtHost;
    }

    /**
     * 设置操作主机
     *
     * @param crtHost 操作主机
     */
    public void setCrtHost(String crtHost) {
        this.crtHost = crtHost;
    }
}