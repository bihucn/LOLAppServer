package com.lol.common.service;

import java.util.List;

import com.lol.common.dto.PictureDto;

public interface PictureService {

	
	/**
	* @Title: getPictures 
	* @Description: 获取图片列表
	* @author johnzhu
	* @date 2016-7-4
	* List<PictureDto>  
	* @throws
	 */
	public List<PictureDto> getPictures(PictureDto condition,int pageSize,int pageNO);
}
