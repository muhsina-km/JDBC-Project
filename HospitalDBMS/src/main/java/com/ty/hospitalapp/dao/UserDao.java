package com.ty.hospitalapp.dao;

import com.ty.hospitalapp.dto.User;

public interface UserDao {
	
public User saveUser(User user);
	
	public boolean deleteUserById(int uid);
	
	public User getUserById(int uid);
	
	public User updateUserById(int uid, User user);
	
	

}
