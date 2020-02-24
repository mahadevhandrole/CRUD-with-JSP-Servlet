package module;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.DB_Connection;

public class RegistrationJDBC 
{
	public int Reg(String sl_no,String name,String password,String address,String city,String email,String gender,String mobno1,String mobno2,String language)
	{
		String qry="insert into vs.studentreg values(?,?,?,?,?,?,?,?,?,?)";
		
		DB_Connection object_DB_Connection=new DB_Connection();
		Connection connection=object_DB_Connection.get_connection();
		int status = 0;
		try {
			PreparedStatement ps=connection.prepareStatement(qry);
			ps.setString(1, sl_no);
			ps.setString(2, name);
			ps.setString(3, password);
			ps.setString(4, address);
			ps.setString(5, city);
			ps.setString(6, email);
			ps.setString(7, gender);
			ps.setString(8, mobno1);
			ps.setString(9, mobno2);
			ps.setString(10,language);
			status=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
		
		
	}

}
