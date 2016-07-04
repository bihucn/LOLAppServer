package com.lol.common.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="apk_version")
public class ApkVersion implements Serializable {

	/**
	 * APK发布状态-未发布
	 */
	public static short APK_PUBLISH_STATUS_ON=1;
	
	/**
	 * APK发布状态-已经发布
	 */
	public static short APK_PUBLISH_STATUS_OFF=0;

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="apk_version_id")
	private Integer apkVersionId;
	
	@Column(name="apk_version_no")
	private String apkVersionNo;
	
	@Column(name="publish_time")
	private Date publishTime;
	
	@Column(name="apk_version_desc")
	private String apkVersionDesc;
	
	@Column(name="publish_status")
	private Short publishStatus;
	
	@Column(name="note")
	private String note;
	
	@Column(name="status")
	private Short status;
	
	@Column(name="apk_config_src")
	private String apkConfigSrc;
	
	@Column(name="apk_src")
	private String apkSrc;
	
	@Column(name="md5_code")
	private String md5Code;
	
	@Column(name="file_size")
	private Integer fileSize;

	/**
	 * @return the apkVersionId
	 */
	public Integer getApkVersionId() {
		return apkVersionId;
	}

	/**
	 * @param apkVersionId the apkVersionId to set
	 */
	public void setApkVersionId(Integer apkVersionId) {
		this.apkVersionId = apkVersionId;
	}

	/**
	 * @return the apkVersionNo
	 */
	public String getApkVersionNo() {
		return apkVersionNo;
	}

	/**
	 * @param apkVersionNo the apkVersionNo to set
	 */
	public void setApkVersionNo(String apkVersionNo) {
		this.apkVersionNo = apkVersionNo;
	}

	/**
	 * @return the publishTime
	 */
	public Date getPublishTime() {
		return publishTime;
	}

	/**
	 * @param publishTime the publishTime to set
	 */
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	/**
	 * @return the apkVersionDesc
	 */
	public String getApkVersionDesc() {
		return apkVersionDesc;
	}

	/**
	 * @param apkVersionDesc the apkVersionDesc to set
	 */
	public void setApkVersionDesc(String apkVersionDesc) {
		this.apkVersionDesc = apkVersionDesc;
	}

	/**
	 * @return the publishStatus
	 */
	public Short getPublishStatus() {
		return publishStatus;
	}

	/**
	 * @param publishStatus the publishStatus to set
	 */
	public void setPublishStatus(Short publishStatus) {
		this.publishStatus = publishStatus;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the status
	 */
	public Short getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Short status) {
		this.status = status;
	}

	/**
	 * @return the apkConfigSrc
	 */
	public String getApkConfigSrc() {
		return apkConfigSrc;
	}

	/**
	 * @param apkConfigSrc the apkConfigSrc to set
	 */
	public void setApkConfigSrc(String apkConfigSrc) {
		this.apkConfigSrc = apkConfigSrc;
	}

	/**
	 * @return the apkSrc
	 */
	public String getApkSrc() {
		return apkSrc;
	}

	/**
	 * @param apkSrc the apkSrc to set
	 */
	public void setApkSrc(String apkSrc) {
		this.apkSrc = apkSrc;
	}

	/**
	 * @return the md5Code
	 */
	public String getMd5Code() {
		return md5Code;
	}

	/**
	 * @param md5Code the md5Code to set
	 */
	public void setMd5Code(String md5Code) {
		this.md5Code = md5Code;
	}

	/**
	 * @return the fileSize
	 */
	public Integer getFileSize() {
		return fileSize;
	}

	/**
	 * @param fileSize the fileSize to set
	 */
	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}
	
	public String getApplyTimeShow(){
		if(this.publishTime!=null){
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			return dateFormat.format(publishTime);
		}
		return "";
	}
	
	

}
