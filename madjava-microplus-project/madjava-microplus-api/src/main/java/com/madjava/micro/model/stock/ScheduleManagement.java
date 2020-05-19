package com.madjava.micro.model.stock;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Table(name = "schedule_management")
public class ScheduleManagement implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    public static final String _ID = "id";

    //定时任务名称
    public static final String _SCHEDULENAME = "scheduleName";

    //最后执行时间
    public static final String _LASTRUNTIME = "lastRunTime";

    //
    public static final String _LASTSUCCESSTIME = "lastSuccessTime";

    //错误信息
    public static final String _ERRORMESSAGE = "errorMessage";


    //
    @Id
    private Long id;

    //定时任务名称
    @Column(name = "schedule_name")
    private String scheduleName;

    //最后执行时间
    @Column(name = "last_run_time")
    private Date lastRunTime;

    //
    @Column(name = "last_success_time")
    private Date lastSuccessTime;

    //错误信息
    @Column(name = "error_message")
    private String errorMessage;


    /**
     * 设置：
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * 获取：
     */
    public Long getId() {
        return id;
    }
    /**
     * 设置：定时任务名称
     */
    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }
    /**
     * 获取：定时任务名称
     */
    public String getScheduleName() {
        return scheduleName;
    }
    /**
     * 设置：最后执行时间
     */
    public void setLastRunTime(Date lastRunTime) {
        this.lastRunTime = lastRunTime;
    }
    /**
     * 获取：最后执行时间
     */
    public Date getLastRunTime() {
        return lastRunTime;
    }
    /**
     * 设置：
     */
    public void setLastSuccessTime(Date lastSuccessTime) {
        this.lastSuccessTime = lastSuccessTime;
    }
    /**
     * 获取：
     */
    public Date getLastSuccessTime() {
        return lastSuccessTime;
    }
    /**
     * 设置：错误信息
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    /**
     * 获取：错误信息
     */
    public String getErrorMessage() {
        return errorMessage;
    }
}
