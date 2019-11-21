package servlet;

import java.io.IOException;  // cmd+shift+o
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4023442997406361930L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 删除一整行：cmd+d
		
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		System.out.println("Post");
		
		// 取值
		String username = req.getParameter("username");
		String pwd = req.getParameter("pwd");
				
		PrintWriter out = resp.getWriter();
		out.println(username+pwd);
		
		
	}
}
