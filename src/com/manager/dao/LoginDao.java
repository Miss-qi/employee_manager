package com.manager.dao;

import java.util.List; 
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

import com.manager.po.AddRolePo;
import com.manager.po.AddUserPo;
import com.manager.po.SelectUserPo;
import com.manager.po.UserPO;
import com.manager.vo.AdminVO;

public class LoginDao {
	private SqlSessionTemplate sqlTemplate;

	/**
	 * 用户登录
	 * */
	public AdminVO login(UserPO user) {
		return sqlTemplate.selectOne("manager_select.login",user) ;
	}
	
	/**
	 * 添加用户
	 * */
    public void adduser(AddUserPo auser){
    int a = sqlTemplate.insert("manager_insert.adduser",auser);
    System.out.println(a);
    }

	public void setSqlTemplate(SqlSessionTemplate sqlTemplate) {
		this.sqlTemplate = sqlTemplate;
	}

	public List<SelectUserPo> selectUser() {
		return sqlTemplate.selectList("manager_select.selectUser");
	}

	public void addRole(AddRolePo ap) {
		sqlTemplate.insert("manager_insert.addRole", ap);
	}

}
