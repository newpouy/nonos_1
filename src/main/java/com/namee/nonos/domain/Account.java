package com.namee.nonos.domain;

public class Account {
	public int userId;
	public String username;
	public String password;
	public String role;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isAdmin() {
		if(role.equals("ADMIN")){
			return true;
		}
		return false;
	}
}
