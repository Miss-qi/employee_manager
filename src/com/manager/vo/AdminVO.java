package com.manager.vo;

public class AdminVO {
	private String name;
    private String permission;
    
	public String getName() {
		System.out.println("this is name of getName");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	@Override
	public String toString() {
		 System.out.println("AdminVO [name=" + name + ", permission=" + permission + "]");
		return null;
	}

}
