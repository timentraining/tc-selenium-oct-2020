package net.techcenture.framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	
	private Connection conn;
	public Database() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost/myappdb", "root", null);
	}
	
	
	
	public ResultSet executeQuery(String sql) throws SQLException {
		
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		return rs;
	}
	
	
	public int columnCount(String sqlQuery) throws SQLException {
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery(sqlQuery);
		return rs.getMetaData().getColumnCount();
	}

}
