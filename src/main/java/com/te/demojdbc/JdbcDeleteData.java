package com.te.demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDeleteData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_employee", "root",
					"admin");
			PreparedStatement psmt = connection.prepareStatement("delete from JdbcEmployee where empId =?");
			psmt.setInt(1, 10);

			int executeUpdate = psmt.executeUpdate();
			System.out.println(executeUpdate + "--");
			connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
