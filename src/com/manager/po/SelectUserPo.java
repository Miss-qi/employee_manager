package com.manager.po;

import java.sql.Time;

public class SelectUserPo {

	private int managerID;
	private String name;
	private long phoneNumber;
	private int email;
	private int createPerson;
	private Time createTime;
	private int password;
	private String permission;
	
	public int getManagerID() {
		return managerID;
	}
	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getEmail() {
		return email;
	}
	public void setEmail(int email) {
		this.email = email;
	}
	public int getCreatePerson() {
		return createPerson;
	}
	public void setCreatePerson(int createPerson) {
		this.createPerson = createPerson;
	}
	
	public Time getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Time createTime) {
		this.createTime = createTime;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	@Override
	public String toString() {
		return "SelectUserPo [managerID=" + managerID + ", name=" + name
				+ ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", createPerson=" + createPerson + ", createTime="
				+ createTime + ", password=" + password + ", permission="
				+ permission + "]";
	}
	
}
