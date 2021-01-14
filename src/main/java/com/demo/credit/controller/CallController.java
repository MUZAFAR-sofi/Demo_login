package com.demo.credit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.domain.History;
import com.demo.login.service.CallService;


@RestController
@RequestMapping("/api/call")
public class CallController {

	@Autowired
	CallService mCallService;
	

	@GetMapping(path = "/")
	public String welcome() {

		return "Welcome";
	}
	
	
	@GetMapping(path = "/callHistory/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<History> callHistory(@PathVariable("userId") String userId) {

		List<History> myHistoryList = mCallService.getCallHistory(userId);
		return myHistoryList;

	}
}
