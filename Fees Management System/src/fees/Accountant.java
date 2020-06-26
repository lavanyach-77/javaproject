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

public class Accountant 
{
	public void addStudent(BufferedReader buff) throws Exception
	{
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Accountantdb", "root","Lavanya@1998");

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
	public void viewStudent(BufferedReader buff) throws SQLException
	{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb", "root","Lavanya@1998");
		Statement stmt=con.createStatement();
		ResultSet rst=stmt.executeQuery("Select * from accountant");
		while(rst.next())
			System.out.println(rst.getString(1)+rst.getString(2)+rst.getString(3)+rst.getString(4));
		con.close();
		
	}
	public void editStudent(BufferedReader buff) throws SQLException
	{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb", "root","Lavanya@1998");
        PreparedStatement stmtUpdate = con.prepareStatement("update contact set name=? where contact_id=?");
		stmtUpdate.setString(1, "Viru Sehwag"); 
		stmtUpdate.setInt(2, 3); 
		
		System.out.println(stmtUpdate.executeUpdate() + " No of Records Updated");

		
	}
	public void dueFees(BufferedReader buff)
	{
		
	}
}
