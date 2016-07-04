package com.lol.common.service.impl;

import java.util.List;

import com.lol.common.entity.ApkVersion;
import com.lol.common.entity.Area;
import com.lol.common.entity.ConvertApply;
import com.lol.common.entity.PointsChangeRecord;
import com.lol.common.entity.PointsSyncRecord;
import com.lol.common.entity.User;
import com.lol.common.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public User getUserByCode(String userCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ConvertApply> getConvertAppliesByCode(String userCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doAddConvertApply(ConvertApply convertApply)
			throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void doAddPointsChangeRecord(PointsChangeRecord pointsChangeRecord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean doAddPointsSyncRecord(PointsSyncRecord pointsSyncRecord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Area> getAreas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApkVersion getLatestVersion() {
		// TODO Auto-generated method stub
		return null;
	}

}
