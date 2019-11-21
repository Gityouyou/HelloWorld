package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class UserManager {
	String username;
	String password;
	public UserManager(String name, String pwd) {
		// TODO Auto-generated constructor stub
		username = name;
		password = pwd;
		System.out.println(username+password);
		handleDB();
	}

	// MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/test";
					
	// 数据库的用户名与密码，需要根据自己的设置
	static final String user = "root";
	static final String pwd = "123456";
	 final void handleDB() {
		Connection conn = null;
        PreparedStatement preparedStatement = null;
        
        try {
        	// 注册 JDBC 驱动
        	Class.forName(JDBC_DRIVER);
        	
        	// 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,user,pwd);
            
            // 执行查询
            System.out.println("实例化Statement对象");
            String sql = "select id,name,password from user";
            preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
                String name = rs.getString("name");
                String pwd = rs.getString("password");
                if (name.equals(username) && pwd.equals(password)) {
                	System.out.println(username+"登录成功");
                }
            }
            // 完成后关闭
            rs.close();
            preparedStatement.close();
            conn.close();
            
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(preparedStatement!=null) preparedStatement.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = new String();
		string.charAt(1);
		// 静态方法只能静态引用变量，不能调用非静态变量（需要实例化调用非静态）。
		
	}

}
