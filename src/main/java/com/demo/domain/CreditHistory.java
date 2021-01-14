package com.demo.domain;

public class CreditHistory {

	private String userName;
	private double amount;
	private String dateofCredit;
	private boolean credited;
	private boolean debited;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDateofCredit() {
		return dateofCredit;
	}
	public void setDateofCredit(String dateofCredit) {
		this.dateofCredit = dateofCredit;
	}
	public boolean isCredited() {
		return credited;
	}
	public void setCredited(boolean credited) {
		this.credited = credited;
	}
	public boolean isDebited() {
		return debited;
	}
	public void setDebited(boolean debited) {
		this.debited = debited;
	}
	
	
}
