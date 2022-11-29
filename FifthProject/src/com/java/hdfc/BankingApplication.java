package com.java.hdfc;

public class BankingApplication 
{
	private int userId;
	private String userName;
	
	BankingApplication(){
		
	}

	@Override
	public String toString() {
		return "BankingApplication [userId=" + userId + ", userName=" + userName + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public BankingApplication(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

}
