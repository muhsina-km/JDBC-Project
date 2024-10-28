package com.ty.hospitalapp.service;

import com.ty.hospitalapp.dao.imp.UserDaoImp;
import com.ty.hospitalapp.dto.User;

public class UserService {
	
	public void saveUser(User user) {
		UserDaoImp daoImp=new UserDaoImp();
		User user2=daoImp.saveUser(user);
		if (user2!=null) {
			System.out.println("Data Saved");
		}
		else {
			System.out.println("Unfortunately Data not Saved");
		}
	}
	
	public User getUserById(int uid) {
		UserDaoImp daoImp=new UserDaoImp();
		User user=daoImp.getUserById(uid);
		if (user!=null) {
			return user;
		}
		else {
			return null;
		}
	}
	
	public void deleteUserById(int uid) {
		UserDaoImp daoImp=new UserDaoImp();
		boolean flag=daoImp.deleteUserById(uid);
		if (flag) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data not Deleted");
		}
	}
	
	public User updateUserById(int uid, User user) {
		UserDaoImp daoImp=new UserDaoImp();
		User user2=daoImp.updateUserById(uid, user);
		if (user2!=null) {
			return user2;
		}
		else {
			return null;
		}
	}

}
