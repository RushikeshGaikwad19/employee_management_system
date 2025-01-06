package corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/employee_management_system";
		String username = "root";
		String password = "Rushi123@#";

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			System.out.println("Connected to the database!");

			Statement statement = connection.createStatement();

			String query = "SHOW TABLES;";
			ResultSet resultSet = statement.executeQuery(query);

			System.out.println("Tables in the database:");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
			}

		} catch (Exception e) {
			System.err.println("Error connecting to the database: " + e.getMessage());
		}
	}
}
