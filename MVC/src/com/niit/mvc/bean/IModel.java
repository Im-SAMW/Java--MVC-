package com.niit.mvc.bean;

import java.util.List;


/**
 * ģ�͵�ͨ�ýӿ�
 * @author Administrator
 *
 */
public interface IModel {
	/**
	 * ����ҵ��ķ���
	 * @return
	 */
	public String execute();
	
	/**
	 * ��ȡ������ͼ��ת����
	 * @return
	 */
	public List<ActionForward> getActionForwards();
}
