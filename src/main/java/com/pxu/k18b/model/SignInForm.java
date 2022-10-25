package com.pxu.k18b.model;

public class SignInForm {
	private String userName;
	private String password;
	public SignInForm(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public SignInForm() {
		super();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
