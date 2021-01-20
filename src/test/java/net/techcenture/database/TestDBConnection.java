package net.techcenture.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDBConnection {

	public static void main(String[] args) throws SQLException {
		
		String commonQuery = "select username, first_name from user_details";
	
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/myappdb", "root", null);
		Statement statement = conn.createStatement();
		
		
		ResultSet rs = statement.executeQuery("SELECT status FROM user_details WHERE username='sqluser'");
		rs.next();
		System.out.println("Status is: " + rs.getInt("status"));
		
		
		
//		ResultSet rs = statement.executeQuery(commonQuery);
//		System.out.println(rs.getMetaData().getColumnCount());
		
		
//		ResultSet rs = statement.executeQuery("select count(*) from user_details where last_name='paul'");
//		rs.next();
//		System.out.println(rs.getString("count(*)"));
//		
		
		
		/*
		//get all the userid, firstname, lastname
		ResultSet rs = statement.executeQuery("select username, first_name, last_name from user_details");
		while(rs.next()) {
			String username = rs.getString("username");
			String firstname = rs.getString("first_name");
			String lastname = rs.getString("last_name");
			System.out.println(username +" | " + firstname + " | "+ lastname);
		}
		*/
		
		/*
		//make a simple query and get record from given column and row
		ResultSet rs = statement.executeQuery("select * from user_details where last_name = 'john'");
		rs.next();
		System.err.println(rs.getString(5));
		rs.next();
		System.err.println(rs.getString("password"));
		*/

	}

}
