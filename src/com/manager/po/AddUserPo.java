package com.manager.po;

public class AddUserPo {
	private String managerID;
	private String name;
	private String phoneNumber;
	private String email;
	private String createPerson;
	private String createTime;
	private String password;
	private String permission;
	public String getManagerID() {
		return managerID;
	}
	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreatePerson() {
		return createPerson;
	}
	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
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
		return "AddUserPo [managerID=" + managerID + ", name=" + name
				+ ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", createPerson=" + createPerson + ", createTime="
				+ createTime + ", password=" + password + ", permission="
				+ permission + "]";
	}
	
	
}
