package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBManager {

//	1. 定义数据库信息
    private static final String url = "jdbc:mysql://192.168.1.102:3306/test";
    private static final String name = "com.mysql.jdbc.Driver";
    private static final String username = "root";
    private static final String password = "1234";
	
//    2、开启连接
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private DBManager(String sql){
        try{
            Class.forName(name);
            connection = DriverManager.getConnection(url, username, password);
            preparedStatement = connection.prepareStatement(sql);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
//    3、关闭连接
    private void close(){
        try{
            this.connection.close();
            this.preparedStatement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM student";
        DBManager dbManager = new DBManager(sql);  //实例化

        String id, name, gender, age;

        try{
            ResultSet result = dbManager.preparedStatement.executeQuery();
            while(result.next()){                  //若有数据，就输出
                id = result.getString(1);
                name = result.getString(2);
                gender = result.getString(3);
                age = result.getString(3);
                //显示出每一行数据
                System.out.println(id + "  " + name + "  " + gender + "  " + age );
            }
            result.close();
            dbManager.close();
            
        }catch (Exception e){
            e.printStackTrace();
        }
		

	}

}
