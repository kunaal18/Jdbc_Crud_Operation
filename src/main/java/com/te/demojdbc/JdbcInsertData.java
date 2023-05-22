package com.te.demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcInsertData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // load and register the driver
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_employee", "root",
					"admin"); //establish a connection with the database server
			PreparedStatement stmt = connection.prepareStatement(("insert into JdbcEmployee values(?,?,?)"));  //create a statement //execute the sql queries
			stmt.setInt(1, 20);
			stmt.setString(2, "Komal Strak");
			stmt.setString(3, "Mumbai");

			int executeUpdate = stmt.executeUpdate();  //process the resultant data (optional)
			System.out.println(executeUpdate + "   ");

			connection.close();  //close all the costly resources

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
