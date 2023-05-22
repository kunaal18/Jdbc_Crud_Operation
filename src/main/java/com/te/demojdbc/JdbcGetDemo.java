package com.te.demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcGetDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_employee", "root",
					"admin");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from JdbcEmployee");
			while (rs.next()) {
				int id = rs.getInt("empId");
				String name = rs.getString("empName");
				String city = rs.getString("empCity");
				System.out.println(id + " " + name + " " + city);
			}
			connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
