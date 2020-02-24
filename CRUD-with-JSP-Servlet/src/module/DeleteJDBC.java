package module;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.DB_Connection;

public class DeleteJDBC {

	
	public int DeleteData(String sl_no)
	{
		// TODO Auto-generated method stub
		
        int status = 0;
		DB_Connection object_DB_Connection=new DB_Connection();
		Connection connection=object_DB_Connection.get_connection();
		
		String qry="delete from vs.studentreg where sl_no=?";
		
		 PreparedStatement ps=null;
			try {
				ps=connection.prepareStatement(qry);
				
				 ps.setString(1, sl_no);
				 
				status=ps.executeUpdate();
				 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return status;
				
			
		
	}

}
