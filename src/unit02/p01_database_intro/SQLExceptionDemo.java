package unit02.p01_database_intro;

import java.sql.*;

public class SQLExceptionDemo {

    public static void main(String[] args) {
        try {
            // deliberately wrong URL, to demonstrate what SQLException looks like
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:9999/nonexistentdb", "root", "Mysql");
        } catch (SQLException e) {
            System.out.println("Caught an SQLException!");
            System.out.println("Message: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());
        }
    }
}
