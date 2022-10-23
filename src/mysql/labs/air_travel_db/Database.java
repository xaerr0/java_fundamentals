package mysql.labs.air_travel_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {

    private final String schema;
    DatabaseConnection databaseConnection;
    Connection connection;
    ResultSet resultSet;

    public Database(String schema) {
        this.schema = schema;
        databaseConnection = new DatabaseConnection(schema);
        connection = databaseConnection.getConnection();
    }

    public void readPassenger() {
        try {
            String sql = "SELECT * FROM passenger";

            PreparedStatement statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String address = resultSet.getString("address");
                String city = resultSet.getString("city");
                String state = resultSet.getString("state");
                int points = resultSet.getInt("points");
                System.out.println("id = " + id + "," + " first name = " + firstName + "," + " last name = " + lastName + "," +
                                   " address = " + address + "," + " city = " + city + "," + " state = " + state + "," + " points = " + points);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertPassenger() {
        try {
            String sql = "INSERT INTO passenger (id, first_name, last_name, address, city, state, points) VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, 7);
            statement.setString(2, "Anna");
            statement.setString(3, "Sassin");
            statement.setString(4, "4816 Locust Court");
            statement.setString(5, "Long Beach");
            statement.setString(6, "CA");
            statement.setInt(7, 5000);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new passenger was inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePassenger() {
        try {
            String sql = "UPDATE passenger SET points = ? WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, 4999);
            statement.setInt(2, 7);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing passenger was updated successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deletePassenger() {
        try {
            String sql = "DELETE FROM passenger WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, 7);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A passenger was deleted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void readAirport() {
        try {
            String sql = "SELECT * FROM airport";

            PreparedStatement statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String iata = resultSet.getString("iata");

                System.out.println("id = " + id + "," + " name = " + name + "," + " iata = " + iata);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }


    public void insertAirport() {
        try {
            String sql = "INSERT INTO airport (id, name, iata) VALUES (?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, 12);
            statement.setString(2, "Orlando International Airport");
            statement.setString(3, "MCO");

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new airport was inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateAirport() {
        try {
            String sql = "UPDATE airport SET name = ? WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "Atlanta Hartsfield - Jackson Intl. Airport");
            statement.setInt(2, 9);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing airport was updated successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteAirport() {
        try {
            String sql = "DELETE FROM airport WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, 12);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("An airport was deleted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}