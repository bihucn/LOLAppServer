package com.lol.common.service;

import java.util.List;

import com.lol.common.entity.ApkVersion;
import com.lol.common.entity.Area;
import com.lol.common.entity.ConvertApply;
import com.lol.common.entity.PointsChangeRecord;
import com.lol.common.entity.PointsSyncRecord;
import com.lol.common.entity.User;

public interface UserService {
	
	/**
	* @Title: getUserByCode 
	* @Description: 获取用户信息
	* @author rensy
	* @date 2015-1-13 下午2:22:52 
	* User  
	* @throws
	 */
	public User getUserByCode(String userCode);
	
	/**
	* @Title: getConvertAppliesByCode 
	* @Description: 获取兑换申请记录
	* @author rensy
	* @date 2015-1-13 下午2:29:29 
	* List<ConvertApply>  
	* @throws
	 */
	public List<ConvertApply> getConvertAppliesByCode(String userCode);
	
	/**
	* @Title: doAddConvertApply 
	* @Description:添加用户申请
	* @author johnzhu
	* @date 2016-7-4 
	* void  
	* @throws
	 */
	public boolean doAddConvertApply(ConvertApply convertApply) throws Exception;
	
	
	/**
	* @Title: doAddPointsChangeRecord 
	* @Description:添加用户积分变更记录
	* @author johnzhu
	* @date 2016-7-4 
	* void  
	* @throws
	 */
	public void doAddPointsChangeRecord(PointsChangeRecord pointsChangeRecord);
	
	/**
	* @Title: doAddPointsSyncRecord 
	* @Description: 添加用户获取积分记录
	* @author johnzhu
	* @date 2016-7-4
	* void  
	* @throws
	 */
	public boolean doAddPointsSyncRecord(PointsSyncRecord pointsSyncRecord);
	
	
	/**
	 * 获取开区列表
	* @Title: getAreas 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @author johnzhu
	* @date 2016-7-4
	* List<Area>  
	* @throws
	 */
	public List<Area> getAreas();
	
	
	/**
	* @Title: getLatestVersion 
	* @Description: 获取最新版本
	* @author johnzhu
	* @date 2016-7-4
	* ApkVersion  
	* @throws
	 */
	public ApkVersion getLatestVersion();

}
