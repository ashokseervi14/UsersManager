package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserManager {

	public static void main(String[] args) {
		String jdbcURL = "jdbc:mysql://127.0.0.1:3306/sampledb";
		String username = "root";
		String password =  "samrat@m11";
		
		
		try {
		Connection connection = DriverManager.getConnection(jdbcURL,username,password);
		
		if(connection != null) {
			System.out.println("Conected to database");
			//connection.close();
		}
		
		//insert into  users table in sample db
//		String sql = "INSERT INTO users(username,email,fullname,password) VALUES(?,?,?,?)";
//		String name = "DEO";
//		String uname = "Dean";
//		String email = "don@gmail.com";
//		String pass = "psswddon";
//		
//		PreparedStatement statement = connection.prepareStatement(sql);
//		statement.setString(1, uname);
//		statement.setString(2, email);
//		statement.setString(3, name);
//		statement.setString(4, pass);
		
		//select
//		
//		String sql = "SELECT * FROM users";
//		
//		Statement statement = connection.createStatement();
		
		String sql = "UPDATE Users SET password = 'olalal' WHERE  username = 'ashok'";
		
		Statement statement = connection.createStatement();
		
		
		
		
		
		try {
		 //int rows = statement.executeUpdate();
			
//	     ResultSet result =  statement.executeQuery(sql);		
//		 
//	     while(result.next()) {
//	    	 String uname = result.getString(2);
//	    	 String fname = result.getString("fullname");
//	    	 System.out.println(uname +" :  "+ fname);
//	     }
			
			int row = statement.executeUpdate(sql);
			
			if(row > 0) {
				System.out.println(row + " updated");
			}
	     
	     
		} catch(Exception exp) {
			System.out.println("Error");
			exp.printStackTrace();
		}
		
		
		
		
		connection.close();
		
		} catch(SQLException ex) {
			ex.printStackTrace();
			
		}

	}
	//basic operations
	

}
