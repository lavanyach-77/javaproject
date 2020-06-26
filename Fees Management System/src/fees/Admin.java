package fees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Admin
{
	public void login(BufferedReader buff)
	{
		try
		{
			System.out.println("enter username");
			String name=buff.readLine();
			System.out.println("enter password");
			String password=buff.readLine();
			System.out.println("enter username");
			if(name.equals("ADMIN")&&password.equals("admin123"))
			{
				System.out.println("successfully login");
			}
			else
			{
				System.out.println("invalid username and password");
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
			
		}
	public void addAccountant(BufferedReader buff) throws Exception
	{
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb", "root","Lavanya@1998");

		 PreparedStatement stmtInsert=con.prepareStatement("insert into contact values(????)");
		 BufferedReader buff1=new BufferedReader (new InputStreamReader(System.in));
		    System.out.println("\nName:");
		    String name=buff1.readLine();
		    System.out.println("\nPassword:");
	     	String password=buff1.readLine();
	     	System.out.println("\nemail:");
	     	String email=buff1.readLine();
	     	System.out.println("\nContactno:");
	       String contact=buff1.readLine();
	     stmtInsert.setString(1, name);
	     stmtInsert.setString(2, password);
	     stmtInsert.setString(3, email);
	     stmtInsert.setString(4, contact);
	     System.out.println(stmtInsert.executeUpdate()+"no of records inserted");
    }
	public void viewAccountant(BufferedReader buff) throws Exception
	{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb", "root","Lavanya@1998");
		Statement stmt=con.createStatement();
		ResultSet rst=stmt.executeQuery("Select * from accountant");
		while(rst.next())
			System.out.println(rst.getString(1)+rst.getString(2)+rst.getString(3)+rst.getString(4));
		con.close();
    }
	public void logout(BufferedReader buff) throws Exception
	{
		String continueChoice;
		boolean transaction=true;
		System.out.println("Do you Want to logout\nlogout \nNo");
		continueChoice =buff.readLine();
		if(continueChoice.equalsIgnoreCase("logout"))
			transaction=false;
	}

}

