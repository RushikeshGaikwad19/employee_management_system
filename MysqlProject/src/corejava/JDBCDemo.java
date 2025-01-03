package corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/employee_management_system"; // Replace DemoDB with your database name
        String username = "root"; // Replace with your MySQL username
        String password = "Rushi123@#"; // Replace with your MySQL password

        // JDBC Connection
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database!");

            // Create a statement
            Statement statement = connection.createStatement();

            // Query to fetch tables
            String query = "SHOW TABLES;";
            ResultSet resultSet = statement.executeQuery(query);

            // Display tables
            System.out.println("Tables in the database:");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }

        } catch (Exception e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }
}
