package mysql.labs.air_travel_db;

import java.sql.*;

public class DatabaseConnection {

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public DatabaseConnection(String schema) {
        connection(schema);
    }

    public Connection getConnection() {
        return connection;
    }

    public void connection(String schema) {
        String query = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/air_travel";
            String username = "cono";
            String password = "";
            connection = DriverManager.getConnection(url, username, password);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}