package net.techcenture.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import io.netty.util.internal.ThreadLocalRandom;

public class CreateDummyData {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/myappdb", "root", null);
		Statement statement = conn.createStatement();
		
		
		for(int i=0;i<100;i++) {
			int rnd = ThreadLocalRandom.current().nextInt(i, 250);
			int rnd2 = ThreadLocalRandom.current().nextInt(i, 250);
			String q = "insert into courses (title,length) values ('selenium"+rnd+"','"+rnd2+"')";
			
			statement.executeQuery(q);
		}
	}

}
