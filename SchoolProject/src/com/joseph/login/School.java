package com.joseph.login;

public class School 
{
	private int userId;
	private String userName;
	public School(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "School [userId=" + userId + ", userName=" + userName + "]";
	}


}
