package com.manager.po;

import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException;

//import sun.misc.BASE64Encoder;

public class UserPO {
	private String user;
	private String pass;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass=pass;
		//System.out.println(pass);
		//this.pass = ECP(pass);
		//System.out.println(this.pass);
	}
	
	//验证登录密码是否正确
	public String ECP(String pass)
	{ 
		String newpass;
		MessageDigest md;
	 byte[] pw=pass.getBytes();
	 try {
		md=MessageDigest.getInstance("MD5");//创建算法为MD5的信息摘要对象
		byte[] newbyte=md.digest(pw);//完成最后的摘要(要加密的字符串)更新
		System.out.println(newbyte);
		newpass=newbyte.toString();
	    //BASE64Encoder encoder=new BASE64Encoder();
	    //newpass=encoder.encode(newbyte);//利用base64算法再进行加密
	   
	 } catch (NoSuchAlgorithmException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		newpass=null;
	}
	 return newpass;
		}
	
	public String toString() {
		System.out.println( "UserPO [user=" + user + ", pass="+pass  + "]");
		return null;
	}
	
}
