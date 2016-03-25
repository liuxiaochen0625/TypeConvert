package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.UserBean;

//@WebServlet(name = "regist",urlPatterns = "/regist",loadOnStartup = 1)
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegistServlet() {
        super();
    }
    
    @Override
    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException{
    	request.setCharacterEncoding("UTF-8");
    	String name = request.getParameter("name");
    	String pass = request.getParameter("pass");
    	String strAge = request.getParameter("age");
    	String strBirth = request.getParameter("birth");
    	
    	Integer age = Integer.valueOf(strAge);
    	Date birth = null;
    	try {
			birth = new SimpleDateFormat("yyyy-MM-dd").parse(strBirth);
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	UserBean user = new UserBean(name, pass, age, birth);
    	
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out = response.getWriter();
    	out.println("<! DOCTYPE html>");
    	out.println("<html>");
    	out.println("<head>");
    	out.println("	<title>类型转换页面</title>");
    	out.println("</head>");
    	out.println("<body>");
    	out.println("	<h1>类型转化页面</h1>");
    	out.println("	用户的用户名:"+user.getName()+"<br />");
    	out.println("	用户的密码:"+user.getPass()+"<br />");
    	out.println("	用户的生日:"+user.getBirth()+"<br />");
    	out.println("	用户的年龄:"+user.getAge()+"<br />");
    	out.println("</body>");
    	out.println("</html>");
    }
}
