package com.lol.common.service;

import java.util.List;

import com.lol.common.dto.HeroDto;

public interface HeroesService {
	
	/**
	* @Title: getHeros 
	* @Description: 查询人物列表
	* @author rensy
	* @date 2015-1-12 上午9:23:29 
	* List<Heroes>  
	* @throws
	 */
	public  List<HeroDto> getHeros(HeroDto heroeDto,int pageSize,int pageNo,String orderby);

}
