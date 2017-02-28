package com.niit.filter;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.niit.controller.MVCTool;
import com.niit.mvc.bean.IModel;
import com.niit.util.CommonUtil;
/**
 * ע�ι�����
 * @author Administrator
 *
 */
public class AutoParamFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		//��ȡ��ǰ����Ҫ�ַ���ģ��
		String path = ((HttpServletRequest)request).getRequestURI();
		IModel model = MVCTool.getModel(path);
		//�����ȡģ�͵��ֽ������
		Class<IModel> classModel = (Class<IModel>) model.getClass();
		//��ȡģ�Ͷ�Ӧ���Ե�setter����
		//Method[] methods = classModel.getDeclaredMethods();
		/*********��ȡ�����е����в���*********/
		Enumeration<String> names = request.getParameterNames();
		//����
		while(names.hasMoreElements()){
			//��ȡ����ļ���
			String key = names.nextElement();
			//���ݼ�����ȡ�����еĲ���ֵ
			String value = request.getParameter(key);
			try {
				Method method = classModel.getDeclaredMethod("set"+CommonUtil.parseFirstUpper(key), String.class);
				//����setter����
				if(method != null){
					method.invoke(model, value);
				}
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//������ת
		chain.doFilter(request, response);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
}
