package com.demo.credit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.domain.History;
import com.demo.login.service.ChatService;


@RestController
@RequestMapping("/api/chat")
public class ChatController {

	@Autowired
	ChatService mChatService;
	

	@GetMapping(path = "/")
	public String welcome() {

		return "Welcome";
	}
	
	
	@GetMapping(path = "/chatHistory/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<History> chatHistory(@PathVariable("userId") String userId) {

		List<History> myCreditList = mChatService.getChatHistory(userId);
		return myCreditList;

	}
}
