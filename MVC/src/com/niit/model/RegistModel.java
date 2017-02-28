package com.niit.model;

import com.niit.mvc.bean.GenericModel;
import com.niit.mvc.bean.IModel;

public class RegistModel extends GenericModel {
	private String userName;
	private String password;
	private String email;
	private String tel;
	
	public String execute() {
		// TODO Auto-generated method stub
		System.out.println(email+"\t"+tel);
		return null;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
