package com.te.demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcCreateTable {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Load and Register the driver
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_employee", "root",
					"admin"); // Establish a connection with theDB server
			Statement stmt = connection.createStatement();
			String query = "create table JdbcEmployee(empId int(20) primary key,empName varchar(200),empCity varchar(200))";

			stmt.executeUpdate(query);
			// System.out.println(executeUpdate);
			System.out.println("Table Created Successfully...");
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
