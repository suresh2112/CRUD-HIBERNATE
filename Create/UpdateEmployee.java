package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEmployee {

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
//			int rowsUpdated = statement.executeUpdate("UPDATE EMPLOYEE SET ENAME = 'Rani', ESAL = 50000.00 WHERE EID = 1002");
			int rowsUpdated = statement.executeUpdate("UPDATE EMPLOYEE SET ESAL = 50000.00");
			System.out.println(rowsUpdated + " Rows Updated Successfully... ");
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
