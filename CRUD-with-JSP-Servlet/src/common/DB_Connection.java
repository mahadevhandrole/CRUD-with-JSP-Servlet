package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DB_Connection object_DB_Connection =new DB_Connection();
		
		System.out.println(object_DB_Connection.get_connection());

	}

	public Connection get_connection() {
		// TODO Auto-generated method stub
		
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/vs","root","root");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return connection;
	}

}
