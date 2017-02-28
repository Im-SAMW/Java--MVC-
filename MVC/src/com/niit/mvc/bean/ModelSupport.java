package com.niit.mvc.bean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 模型对象的支持类
 * @author Administrator
 *
 */
public class ModelSupport {
	private static HttpServletRequest request;

	public synchronized static HttpServletRequest getRequest() {
		return request;
	}

	public synchronized static void setRequest(HttpServletRequest request) {
		ModelSupport.request = request;
	}
	
	public synchronized static HttpSession getSession(){
		if(request != null){
			return request.getSession();
		}
		return null;
	}
	
	public synchronized static void destroy(){
		request = null;
	}
	
}
