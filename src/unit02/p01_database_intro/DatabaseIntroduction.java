package unit02.p01_database_intro;

import java.sql.*;

public class DatabaseIntroduction {

    public static void main(String[] args) {
        try {
            // 1. DriverManager finds/loads the right Driver, returns a Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb", "root", "password");

            // 2. Connection lets us create a Statement
            Statement stmt = con.createStatement();

            // 3. Statement executes SQL, returns a ResultSet (for SELECT queries)
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            // 4. ResultSet lets us iterate through returned rows
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

        } catch (SQLException e) {
            // 5. SQLException handles any database-related errors
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
