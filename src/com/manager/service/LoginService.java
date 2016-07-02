package com.manager.service;

import java.util.List;

import com.manager.dao.LoginDao;
import com.manager.po.AddRolePo;
import com.manager.po.AddUserPo;
import com.manager.po.SelectUserPo;
import com.manager.po.UserPO;
import com.manager.vo.AdminVO;

public class LoginService {
	private LoginDao loginDao;
	
	/**
	 * 用户登录
	 * */
	public AdminVO login(UserPO user) {
		return this.loginDao.login(user);
	}
	
	/**
	 * 添加用户
	 * */
    public void adduser(AddUserPo auser){
    	 this.loginDao.adduser(auser);
    }
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	
	/**
	 * 查询用户
	 * @return 
	 * */
	public List<SelectUserPo> selectUser() {
		return this.loginDao.selectUser();
	}
	/**
	 * 添加角色
	 * */
	public void addRole(AddRolePo ap) {
		this.loginDao.addRole(ap);
	}

}
