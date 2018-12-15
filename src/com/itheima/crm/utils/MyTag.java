package com.itheima.crm.utils;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag extends TagSupport {
	
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = super.pageContext.getOut();
		
		try {
			out.print("<spn>这是自定义标签输出的内容<span>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return super.doStartTag();
	}
		

}
