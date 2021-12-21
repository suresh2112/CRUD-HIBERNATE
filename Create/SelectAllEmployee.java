package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllEmployee {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;

		try {
			// Step 1 : Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step 2: Create Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");
			// Step 3: Execute Query
			statement = connection.createStatement();
			rs = statement.executeQuery("SELECT * FROM EMPLOYEE");
			while(rs.next()) {
				System.out.println("Emp id : "+rs.getInt("eid"));
				System.out.println("Emp name : "+rs.getString("ename"));
				System.out.println("Emp Sal : "+rs.getDouble("esal"));
				System.out.println("--------------------------------------");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
