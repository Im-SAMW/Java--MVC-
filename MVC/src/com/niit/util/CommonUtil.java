package com.niit.util;

public class CommonUtil {
	/**
	 * ����ĸ��д
	 * @param name
	 * @return
	 */
	public static String parseFirstUpper(String name){
		return name.substring(0,1).toUpperCase().concat(name.substring(1));
	}
}
