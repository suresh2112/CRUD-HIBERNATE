package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;

		try {
			// Step 1 : Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step 2: Create Connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");
			// Step 3: Execute Query
			statement = connection.createStatement();
			boolean flag = statement.execute("CREATE TABLE ACCOUNT(AID INT PRIMARY KEY, ANAME VARCHAR(30))");

			System.out.println(flag);
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
