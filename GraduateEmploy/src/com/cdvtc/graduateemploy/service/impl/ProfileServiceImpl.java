package com.cdvtc.graduateemploy.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cdvtc.graduateemploy.dao.IProfileDAO;
import com.cdvtc.graduateemploy.model.Profile;
import com.cdvtc.graduateemploy.service.IProfileService;

@Transactional
@Component("profileService")
public class ProfileServiceImpl implements IProfileService {
	@Resource(name="profileDAO")
	public void setProfileDAO(IProfileDAO profileDAO) {
		this.profileDAO = profileDAO;
	}
	public boolean delete(Profile p) {
		return profileDAO.delete(p);
	}

	public boolean deleteById(int id) {
		return profileDAO.deleteById(id);
	}

	public Profile findById(int id) {
		return profileDAO.findById(id);
	}

	public boolean insert(Profile p) {
		return profileDAO.insert(p);
	}

	public boolean update(Profile p) {
		return profileDAO.update(p);
	}
	private IProfileDAO profileDAO;
}
