package struts2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class LoginWithDBAction extends ActionSupport {

//	Action类具有与数据库表中的列对应的属性
	private String user;
	private String password;
	private String name;

	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String ret = ERROR;
		Connection conn = null;
		try {

			String URL = "jdbc:mysql://localhost:3306/struts";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "123456");
			String sql = "SELECT name FROM login WHERE";
			sql += " user = ? AND password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				name = rs.getString(1);
				ret = SUCCESS;
			}

		} catch (Exception e) {
			e.printStackTrace();
			ret = ERROR;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}
		return ret;
	      
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
}
