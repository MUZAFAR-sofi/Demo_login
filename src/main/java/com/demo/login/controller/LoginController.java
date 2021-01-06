package com.demo.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.login.domain.User;
import com.demo.login.service.UserService;
/**
 * 
 * @author sofiahmed
 *
 */
@RestController
@RequestMapping("/api")
public class LoginController {

	@Autowired
	UserService mUserLoginService;
	
	@GetMapping(path = "/")
	public String welcome() {

		return "Welcome";
	}
	
	@PostMapping(path = "/login")
	public String firstPage(@RequestBody User pUser) {

		String loginSuccess = "Failure";

		boolean isValidUser = mUserLoginService.verifyUser(pUser);

		if (isValidUser) {
			loginSuccess = "Success";
		}
		return loginSuccess;
	}
}
