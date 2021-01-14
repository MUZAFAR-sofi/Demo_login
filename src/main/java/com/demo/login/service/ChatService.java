package com.demo.login.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.login.domain.History;
@Service
public class ChatService {
	
	/**
	 * 
	 * @param pUserId
	 * @return
	 */
	public List<History> getChatHistory(String pUserId)
	{
		History myHistory1 = new History();
		
		myHistory1.setUserName("Loretta Russel");
		myHistory1.setDateofChat(formatDate());
		
		History myHistory2 = new History();
		myHistory2.setUserName("Green");
		myHistory2.setDateofChat(formatDate());
		
		History myHistory3 = new History();
		myHistory3.setUserName("Ahmed Shaik");
		myHistory3.setDateofChat(formatDate());
		
		List<History> myCreditHistories = new ArrayList<History>();
		myCreditHistories.add(myHistory1);
		myCreditHistories.add(myHistory2);
		myCreditHistories.add(myHistory3);
		
		return myCreditHistories;
		
	}
	private String formatDate()
	{
		String pattern = "dd-MMM - hh:mm a";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = null;

		date = simpleDateFormat.format(new Date());
		System.out.println(date);

		return date;

	}

}
