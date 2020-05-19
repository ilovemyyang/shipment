package com.madjava.micro.model.user;


import java.io.Serializable;
import java.util.Date;


/**
 * <pre>
 * =============================================================================
 * 内容:
 * =============================================================================
 * </pre>
 *
 * @author 埃森哲-
 */
public class Systemcomment implements Serializable
{

	/**
	 *
	 */
	private static final long serialVersionUID = 9045949294212151705L;

	/**
	 */
	private String pk;

	/**
	 */
	private String userPk;

	/**
	 */
	private String comment;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * <pre>
	 * </pre>
	 *
	 * @return the pk
	 */
	public String getPk()
	{

		return pk;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * @param pk the pk to set
	 */
	public void setPk(final String pk)
	{

		this.pk = pk;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * @return the userPk
	 */
	public String getUserPk()
	{

		return userPk;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * @param userPk the userPk to set
	 */
	public void setUserPk(final String userPk)
	{

		this.userPk = userPk;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * @return the comment
	 */
	public String getComment()
	{

		return comment;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * @param comment the comment to set
	 */
	public void setComment(final String comment)
	{

		this.comment = comment;
	}

	/**
	 * <pre>
	 * 创建时间
	 * </pre>
	 *
	 * @return the createTime
	 */
	public Date getCreateTime()
	{

		return createTime;
	}

	/**
	 * <pre>
	 * 创建时间
	 * </pre>
	 *
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(final Date createTime)
	{

		this.createTime = createTime;
	}
}
