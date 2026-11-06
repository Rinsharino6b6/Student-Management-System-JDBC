package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/student_db";

    private static final String USERNAME = "root";

    private static final String PASSWORD =
            System.getenv("DB_PASSWORD");

    public static Connection getConnection() throws SQLException {

        if (PASSWORD == null || PASSWORD.isBlank()) {
            throw new SQLException("DB_PASSWORD is not configured");
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("MySQL JDBC Driver Loaded!");

        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL Driver is missing from runtime classpath!", e);
        }

        return DriverManager.getConnection(
                URL, USERNAME, PASSWORD
        );
    }
}