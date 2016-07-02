package com.manager.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.manager.po.AddRolePo;
import com.manager.po.AddUserPo;
import com.manager.po.SelectUserPo;
import com.manager.po.UserPO;
import com.manager.service.LoginService;
import com.manager.vo.AdminVO;

public class LoginAction {
	private UserPO user;
	private LoginService loginService;
	private AdminVO admin;
	private AddUserPo auser;
	private List<SelectUserPo> sp;
	private AddRolePo ap;
	
	/**
	 * 用户登录
	 * */
	public String login(){
		user.toString();
		admin = loginService.login(user);
		if(admin == null){
			return "login";
		}
		admin.toString();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("admin", admin.getName());
		String str=admin.getPermission();
		if(str.equalsIgnoreCase("超级管理员"))
			return "superlogin";
		if(str.equalsIgnoreCase("管理员"))
			return "managerlogin";
		if(str.equalsIgnoreCase("用户"))
			return "commonlogin";
		return "login";
	}
	
	/**
	 * 添加用户
	 * */
  public String adduser(){
	  System.out.println("this is adduser");
	  auser.toString();
	  loginService.adduser(auser);
	  return null;
  }
  /**
   * 查询用户
   * */
  public String selectUser() 
  {
	  System.out.println(222222222);
	  sp = loginService.selectUser();
	  System.out.println(1111111111);
	  System.out.println(sp);
	  return "null";
  }
  /**
   * 重置密码
   * */
 /* public String resetpass()
  {
	  loginService.resetpass();
	  return null;
  }*/
  /**
   * 添加角色
   * */
 public String addRole(){
	 loginService.addRole(ap);
	  return null;
  }
  /**
   * 更新角色
   * */
  /*public String updaterole(){
	  loginService.updaterole();
	  return null;
  }*/
  /**
   * 权限管理
   * */
  /*public String permissionmanage(){
	  loginService.permissionmanage();
	  return null;
  }*/
	public UserPO getUser() {
		return user;
	}

	public void setUser(UserPO user) {
		this.user = user;
	}

	public AdminVO getAdmin() {
		return admin;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	public AddUserPo getAuser() {
		return auser;
	}
	public void setAuser(AddUserPo auser) {
		this.auser = auser;
	}

	public List<SelectUserPo> getSp() {
		return sp;
	}

	public void setSp(List<SelectUserPo> sp) {
		this.sp = sp;
	}

	public AddRolePo getAp() {
		return ap;
	}

	public void setAp(AddRolePo ap) {
		this.ap = ap;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setAdmin(AdminVO admin) {
		this.admin = admin;
	}
	
}
