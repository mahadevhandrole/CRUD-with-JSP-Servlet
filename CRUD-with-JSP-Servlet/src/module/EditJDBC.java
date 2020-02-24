package module;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.DB_Connection;
import common.User_Bean;

public class EditJDBC 
{

	public User_Bean get_value_of_user(String sl_no,String name,String password,String address,String city,String email, String gender, String mobno1,String mobno2,String language)
	{
		
		User_Bean object_User_Bean=new User_Bean();
		DB_Connection object_DB_Connection=new DB_Connection();
		Connection connection=object_DB_Connection.get_connection();
		try {
			
			PreparedStatement ps=null;
			
			ResultSet rs=null;
			
			
			String qry="select * from vs.studentreg where sl_no=?";
			
			ps = connection.prepareStatement(qry);
			
			ps.setString(1, sl_no);
			
			rs=ps.executeQuery();
			
			while(rs.next())
			{
			
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
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return object_User_Bean;
		
	}


	public void Edit_User(User_Bean object_User_bean) 
	{
		DB_Connection object_DB_Connection=new DB_Connection();
		Connection connection=object_DB_Connection.get_connection();
		
		PreparedStatement ps=null;
		
		String qry1=" update vs.studentreg set name=?, password=?, address=?, city=?, email=?, gender=?, mobno1=?, mobno2=?, language=? where sl_no=?";
		try
		{
		ps=connection.prepareStatement(qry1);
		
		ps.setString(1, object_User_bean.getName());
		ps.setString(2, object_User_bean.getPassword());
		ps.setString(3, object_User_bean.getAddress());
		ps.setString(4, object_User_bean.getCity());
		ps.setString(5, object_User_bean.getEmail());
		ps.setString(6, object_User_bean.getGender());
		ps.setString(7, object_User_bean.getMobno1());
		ps.setString(8, object_User_bean.getMobno2());
		ps.setString(9, object_User_bean.getLanguage());
		ps.setString(10, object_User_bean.getSl_no());
		
		ps.executeUpdate();		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
		e.printStackTrace();
	}
	
		// TODO Auto-generated method stub
		
	}

}
