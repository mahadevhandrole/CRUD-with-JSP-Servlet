package module;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DB_Connection;
import common.User_Bean;

public class ReadJDBC 
{
	public List<User_Bean> get_value()
	{
		List< User_Bean> list=new ArrayList<User_Bean>();
		
		DB_Connection object_DB_Connection=new DB_Connection();
		Connection connection=object_DB_Connection.get_connection();
		String qry="select * from vs.studentreg";
		try {
			
			
			PreparedStatement ps=connection.prepareStatement(qry);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				User_Bean object_User_Bean=new User_Bean();
				
				object_User_Bean.setSl_no(rs.getString("sl_no"));
				object_User_Bean.setName(rs.getString("name"));
				object_User_Bean.setPassword(rs.getString("password"));
				object_User_Bean.setAddress(rs.getString("address"));
				object_User_Bean.setCity(rs.getString("city"));
				object_User_Bean.setEmail(rs.getString("email"));
				object_User_Bean.setGender(rs.getString("gender"));
				object_User_Bean.setMobno1(rs.getString("mobno1"));
				object_User_Bean.setMobno2(rs.getString("mobno2"));
				object_User_Bean.setLanguage(rs.getString("language"));
				
				list.add(object_User_Bean);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
		
		
	}

}
