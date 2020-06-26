package fees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class fees
{
	
	public static void main(String[] args) throws Exception 
	{
          Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb", "root","Lavanya@1998");

		
	}

}