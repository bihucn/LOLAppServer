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
import javax.persistence.Transient;

@Entity
@Table(name="convert_apply")
public class ConvertApply implements Serializable {

	/**
	 *  兑换申请已经处理
	 */
	public static final short CONVERT_STATUS_YES = 1;
	
	/**
	 *  兑换申请未处理
	 */
	public static final short CONVERT_STATUS_NO = 0;
	
	/**
	 *   兑换物品类型-皮肤
	 */
	public static final short GOODS_TYPE_PIC = 1;
	
	/**
	 * 兑换物品类型-英雄
	 */
	public static final short GOODS_TYPE_HERO = 2;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="convert_apply_id")
	private Integer convertApplyId;
	
	@Column(name="user_code")
	private String userCode;
	
	@Column(name="apply_time")
	private Date applyTime;
	
	@Column(name="the_goods")
	private String theGoods;
	
	@Column(name="points")
	private Integer points;
	
	@Column(name="price")
	private Float price;
	
	@Column(name="game_id")
	private String gameId;
	
	@Column(name="game_area")
	private String gameArea;
	
	@Column(name="stauts")
	private Short status;
	
	@Column(name="goods_type")
	private Short goodsType;
	
	@Column(name="img_src")
	private String imgSrc;
	
	@Transient
    private Integer goodsId;

	/**
	 * @return the convertApplyId
	 */
	public Integer getConvertApplyId() {
		return convertApplyId;
	}

	/**
	 * @param convertApplyId the convertApplyId to set
	 */
	public void setConvertApplyId(Integer convertApplyId) {
		this.convertApplyId = convertApplyId;
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
	 * @return the applyTime
	 */
	public Date getApplyTime() {
		return applyTime;
	}

	/**
	 * @param applyTime the applyTime to set
	 */
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	/**
	 * @return the theGoods
	 */
	public String getTheGoods() {
		return theGoods;
	}

	/**
	 * @param theGoods the theGoods to set
	 */
	public void setTheGoods(String theGoods) {
		this.theGoods = theGoods;
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
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

	/**
	 * @return the gameId
	 */
	public String getGameId() {
		return gameId;
	}

	/**
	 * @param gameId the gameId to set
	 */
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	/**
	 * @return the gameArea
	 */
	public String getGameArea() {
		return gameArea;
	}

	/**
	 * @param gameArea the gameArea to set
	 */
	public void setGameArea(String gameArea) {
		this.gameArea = gameArea;
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
	
	public String getApplyTimeShow(){
		if(this.applyTime!=null){
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			return dateFormat.format(applyTime);
		}
		return "";
	}

	/**
	 * @return the goodsType
	 */
	public Short getGoodsType() {
		return goodsType;
	}

	/**
	 * @param goodsType the goodsType to set
	 */
	public void setGoodsType(Short goodsType) {
		this.goodsType = goodsType;
	}

	/**
	 * @return the goodsId
	 */
	public Integer getGoodsId() {
		return goodsId;
	}

	/**
	 * @param goodsId the goodsId to set
	 */
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	/**
	 * @return the imgSrc
	 */
	public String getImgSrc() {
		return imgSrc;
	}

	/**
	 * @param imgSrc the imgSrc to set
	 */
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	
}
