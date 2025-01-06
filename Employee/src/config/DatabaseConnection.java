
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/employee_management_system";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Rushi123@#";

	public static Connection getConnection() throws Exception {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
}