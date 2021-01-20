package net.techcenture.framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	
    public static void main( String[] args ) throws SQLException {
    	
    	Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/sample", "root", null);
    	Statement stmt = conn.createStatement();
    	ResultSet rs = stmt.executeQuery("SELECT * from user_details");
    	
    	System.err.println(rs.getMetaData().getColumnCount());
    	rs.last();
    	System.err.println(rs.getRow());
    	while(rs.next()) {
    		System.out.println(rs.getString(1));	
    	}
    	
     
    }
	
}
