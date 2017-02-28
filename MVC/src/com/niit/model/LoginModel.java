package com.niit.model;

import javax.servlet.http.HttpServletRequest;

import com.niit.mvc.bean.GenericModel;
import com.niit.mvc.bean.IModel;
import com.niit.mvc.bean.ModelSupport;
/**
 * µÇÂ¼Ä£ÐÍ
 * @author Administrator
 *
 */
public class LoginModel extends GenericModel {
	private String userName;
	private String password;
	
	public String execute() {
		HttpServletRequest request = ModelSupport.getRequest();
		
		System.out.println(userName+"\t"+password);
		if(userName.equals("admin")){
			if(password.equals("0000")){
				ModelSupport.getSession().setAttribute("loginUser", userName);
				return SUCCESS;
			}
			else{
				request.setAttribute("error", "password error!");
			}
		}
		else{
			request.setAttribute("error", "name error!");
		}
		return ERROR;
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
	
}
