package com.lol.common.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="points_sync_record")
public class PointsSyncRecord implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="points_sync_record_id")
	private Integer pointsSyncRecordId;
	
	@Column(name="order_id")
	private String orderId;
	
	@Column(name="app_id")
	private String appId;
	
	@Column(name="app_name")
	private String appName;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="channel")
	private Integer channel;
	
	@Column(name="points")
	private Integer points;
	
	@Column(name="create_time")
	private Date createTime;

	/**
	 * @return the pointsSyncRecordId
	 */
	public Integer getPointsSyncRecordId() {
		return pointsSyncRecordId;
	}

	/**
	 * @param pointsSyncRecordId the pointsSyncRecordId to set
	 */
	public void setPointsSyncRecordId(Integer pointsSyncRecordId) {
		this.pointsSyncRecordId = pointsSyncRecordId;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the appId
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * @param appId the appId to set
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * @return the appName
	 */
	public String getAppName() {
		return appName;
	}

	/**
	 * @param appName the appName to set
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the channel
	 */
	public Integer getChannel() {
		return channel;
	}

	/**
	 * @param channel the channel to set
	 */
	public void setChannel(Integer channel) {
		this.channel = channel;
	}

	/**
	 * @return the points
	 */
	public Integer getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(Integer points) {
		this.points = points;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	

}
