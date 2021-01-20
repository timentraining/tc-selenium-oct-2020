package net.techcenture.automation.tests1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.techcenture.framework.Database;
import net.timentraining.core.TestBase;

public class TestingDatabaseRecords {
	
	
public static void main(String[] args) throws SQLException {
	//creare data into the DB
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/myappdb", "root", null);
	Statement statement = conn.createStatement();
	
	String query = "insert into user_details (first_name,last_name,gender,username,password) values('john212','smith212','Male','jsmith22','abc1234')";
	
	statement.executeQuery(query);
	
	
	
	
	
	//;
}
	
	
	@Test
	public void createUser() throws SQLException {
		
	//go to website
	//login
	//you create a user with following information
			//username: sqluser
			//firstname: sql
			//lastname: user
			//gender: Male
		
		
	//you verified you successfully created a user
		
	//you want to very same from database also and make sure userid is generate
		
		Database db = new Database();
//		ResultSet rs = db.executeQuery("select * from user_details where username='sqluser' ");
		int colCount  = db.columnCount("select * from user_details");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/myappdb", "root", null);
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery("select * from user_details where username='sqluser' ");
		rs.next();
		int userid = rs.getInt("user_id");
		String username = rs.getString("username");
//		System.out.println(userid);
		Assert.assertEquals(userid>1, true);
		Assert.assertEquals(username, "sqluser");
	}

}
