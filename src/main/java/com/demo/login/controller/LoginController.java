package com.demo.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.login.domain.CreditHistory;
import com.demo.login.domain.User;
import com.demo.login.service.CreditService;
import com.demo.login.service.UserService;

/**
 * 
 * @author sofiahmed
 *
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@Autowired
	UserService mUserLoginService;

	@Autowired
	CreditService mCreditService;

	@GetMapping(path = "/")
	public String welcome() {

		return "Welcome";
	}

	@PostMapping(path = "/login")
	public String login(@RequestBody User pUser) {

		String loginSuccess = "Failure";

		boolean isValidUser = mUserLoginService.verifyUser(pUser);

		if (isValidUser) {
			loginSuccess = "Success";
		}
		return loginSuccess;
	}

	@GetMapping(path = "/creditHistory/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CreditHistory> creditHistory(@PathVariable("userId") String userId) {

		List<CreditHistory> myCreditList = mCreditService.getCreditHistory(userId);
		return myCreditList;

	}
}
