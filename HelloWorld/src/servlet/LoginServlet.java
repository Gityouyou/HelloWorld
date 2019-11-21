package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.UserManager;



public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -154176561953216931L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("登录了");
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String check = req.getParameter("check");
		
		PrintWriter out = resp.getWriter();
		if(username==null || username.equals("")) {
			out.println("姓名不能为空");
		} else if (password==null || password.equals("")) {
			out.println("密码不能为空");
		} else {
//			查询数据库
			UserManager manager = new UserManager(username,password);
			
			
		}
		
		System.out.println(username+"---"+password+"----"+check);
	}

}
