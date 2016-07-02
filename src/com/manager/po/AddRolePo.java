package com.manager.po;

import java.sql.Time;

public class AddRolePo {
	private String roleName;
	private int createPerson;
	private Time createTime;
	private String reviser;
	private Time reviserTime;
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
	public String getReviser() {
		return reviser;
	}
	public void setReviser(String reviser) {
		this.reviser = reviser;
	}
	public Time getReviserTime() {
		return reviserTime;
	}
	public void setReviserTime(Time reviserTime) {
		this.reviserTime = reviserTime;
	}
	
}
