package com.demo.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.login.domain.User;
import com.demo.login.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository mUserRepository;

	/**
	 * 
	 * @param pUser
	 * @return
	 */
	public boolean verifyUser(User pUser) {
		
		//We can also hit the database here
		
		if ("Muzafar".equals(pUser.getUserName()) && "Welcome1".equals(pUser.getPassword()))
			return true;

		return false;
	}

	public boolean getCreditHistory(String userId) {
		// TODO Auto-generated method stub
		return false;
	}

}
