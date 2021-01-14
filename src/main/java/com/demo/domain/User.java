package com.demo.domain;

import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @author sofiahmed
 *
 */
public class User {

	private String userName;

	private String password;
	
	//private MultipartFile imageFile;
	
	private int mobileNumber;

	/*
	 * public MultipartFile getImageFile() { return imageFile; }
	 * 
	 * public void setImageFile(MultipartFile imageFile) { this.imageFile =
	 * imageFile; }
	 */
	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public User() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String UserName) {
		this.userName = UserName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String Password) {
		this.password = Password;
	}

}
