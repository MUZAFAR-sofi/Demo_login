package com.demo.login.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.domain.CreditHistory;
import com.demo.domain.History;
@Service
public class CallService {
	
	/**
	 * 
	 * @param pUserId
	 * @return
	 */
	public List<History> getCallHistory(String pUserId)
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
		
		List<History> myHistories = new ArrayList<History>();
		myHistories.add(myHistory1);
		myHistories.add(myHistory2);
		myHistories.add(myHistory3);
		
		return myHistories;
		
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
