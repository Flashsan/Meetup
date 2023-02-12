package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
    public Connection getConnection_With_DB_PostgreSQL() throws SQLException {
//        ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String driver = "org.postgresql.Driver";
        String username = "postgres";
        String password = "admin";

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver doesn't download");
        }
        return DriverManager.getConnection(url, username, password);
    }


//    public Connection getConnection_With_DB_PostgreSQL() throws SQLException {
//        ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
//        String url = resourceBundle.getString("db.url");
//        String driver = resourceBundle.getString("db.driver");
//        String username = resourceBundle.getString("db.username");
//        String password = resourceBundle.getString("db.password");
//
//        try {
//            Class.forName(driver);
//        } catch (ClassNotFoundException e) {
//            throw new SQLException("Driver doesn't download");
//        }
//        return DriverManager.getConnection(url, username, password);
//    }


}
