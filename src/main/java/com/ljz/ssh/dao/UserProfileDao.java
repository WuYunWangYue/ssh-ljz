package com.ljz.ssh.dao;

import java.util.List;

import com.ljz.ssh.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}