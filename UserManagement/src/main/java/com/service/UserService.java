package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bean.User;
import com.DatabaseOP.UserDatabaseOP;

@Service
public class UserService {
	@Autowired
	UserDatabaseOP userDao;
	public String storeUser(User user) {
		if(userDao.storeUserDetails(user)>0){
			return "User details stored successfully";
		}
		else {
			return "User details didn't store";
		}
	}
	public String updateUser(User user) {
		if(userDao.updateUser(user)>0) {
			return "Record updated successfully";
		}
		else {
			return "Record didn't update";
		}
	}
	public String searchUserById(int uid) {
		User u = userDao.searchUserById(uid);
		if(u==null) {
			return "Record not present";
		}
		else {
			return u.toString();
		}
	}
}
