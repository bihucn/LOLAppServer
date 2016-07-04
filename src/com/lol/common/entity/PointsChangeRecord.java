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
@Table(name="points_change_record")
public class PointsChangeRecord implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="points_change_record_id")
	private Integer pointsChangeRecordId;
	
	@Column(name="user_code")
	private String userCode;
	
	@Column(name="change_points")
	private Integer changePoints;
	
	@Column(name="change_condition")
	private String changeCondition;
	
	@Column(name="change_time")
	private Date changeTime;
 

	/**
	 * @return the pointsChangeRecordId
	 */
	public Integer getPointsChangeRecordId() {
		return pointsChangeRecordId;
	}

	/**
	 * @param pointsChangeRecordId the pointsChangeRecordId to set
	 */
	public void setPointsChangeRecordId(Integer pointsChangeRecordId) {
		this.pointsChangeRecordId = pointsChangeRecordId;
	}

	/**
	 * @return the userCode
	 */
	public String getUserCode() {
		return userCode;
	}

	/**
	 * @param userCode the userCode to set
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	/**
	 * @return the changePoints
	 */
	public Integer getChangePoints() {
		return changePoints;
	}

	/**
	 * @param changePoints the changePoints to set
	 */
	public void setChangePoints(Integer changePoints) {
		this.changePoints = changePoints;
	}

	/**
	 * @return the changeCondition
	 */
	public String getChangeCondition() {
		return changeCondition;
	}

	/**
	 * @param changeCondition the changeCondition to set
	 */
	public void setChangeCondition(String changeCondition) {
		this.changeCondition = changeCondition;
	}

	/**
	 * @return the changeTime
	 */
	public Date getChangeTime() {
		return changeTime;
	}

	/**
	 * @param changeTime the changeTime to set
	 */
	public void setChangeTime(Date changeTime) {
		this.changeTime = changeTime;
	}

	

}
