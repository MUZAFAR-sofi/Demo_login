package com.demo.login.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.login.domain.CreditHistory;
@Service
public class CreditService {
	
	/**
	 * 
	 * @param pUserId
	 * @return
	 */
	public List<CreditHistory> getCreditHistory(String pUserId)
	{
		CreditHistory myCreditHistory1 = new CreditHistory();
		myCreditHistory1.setAmount(100);
		myCreditHistory1.setUserName("User1");
		myCreditHistory1.setDateofCredit(formatDate());
		myCreditHistory1.setCredited(true);
		
		CreditHistory myCreditHistory2 = new CreditHistory();
		myCreditHistory2.setAmount(200);
		myCreditHistory2.setUserName("User2");
		myCreditHistory2.setDateofCredit(formatDate());
		myCreditHistory2.setDebited(true);
		
		CreditHistory myCreditHistory3 = new CreditHistory();
		myCreditHistory3.setAmount(300);
		myCreditHistory3.setUserName("User3");
		myCreditHistory3.setDateofCredit(formatDate());
		myCreditHistory3.isDebited();
	
		List<CreditHistory> myCreditHistories = new ArrayList<CreditHistory>();
		myCreditHistories.add(myCreditHistory1);
		myCreditHistories.add(myCreditHistory2);
		myCreditHistories.add(myCreditHistory3);
		
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
