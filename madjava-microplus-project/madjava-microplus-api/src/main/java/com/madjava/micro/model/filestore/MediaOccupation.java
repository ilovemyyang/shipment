package com.madjava.micro.model.filestore;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author zhidong.peng
 * @email zhidong.peng@accenture.com
 * @date 2020-01-09 17:37:05
 */
@Table(name = "media_occupation")
public class MediaOccupation implements Serializable {
	private static final long serialVersionUID = 1L;
	
    //主键
    @Id
    private String pk;

    @Column(name = "owner_pk")
    private String ownerPk;
    
	//media 主键
    @Column(name = "media_pk")
    private String mediaPk;
    
    //占用media的模块，比如产品，WCMS
    @Column(name = "module")
    private String module;
    
  //创建时间
    @Column(name = "create_time")
    private Date createTime;
    
    public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getMediaPk() {
		return mediaPk;
	}

	public void setMediaPk(String mediaPk) {
		this.mediaPk = mediaPk;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOwnerPk() {
		return ownerPk;
	}

	public void setOwnerPk(String ownerPk) {
		this.ownerPk = ownerPk;
	}
	
}
