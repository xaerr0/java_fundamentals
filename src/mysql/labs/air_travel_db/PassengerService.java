package mysql.labs.air_travel_db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PassengerService {

    DatabaseConnection databaseConnection;
    Connection connection;
    ResultSet resultSet;

    public PassengerService() {
        databaseConnection = new DatabaseConnection("air_travel");
        connection = databaseConnection.getConnection();
    }

    public Passenger getPassenger(Long id) {
        String sql = "SELECT * FROM passenger WHERE id = " + id + ";";
        Passenger passenger = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            passenger = mapResultToPassenger(resultSet).get(0);
            statement.close();
        } catch (SQLException e) {
            System.out.println("Exception thrown!");
            System.out.println(e.getMessage());
        }
        return passenger;
    }

    public List<Passenger> getAllPassengers() {
        String sql = "SELECT * FROM passenger";
        List<Passenger> passengers = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            passengers = mapResultToPassenger(resultSet);
            statement.close();
        } catch (SQLException e) {
            System.out.println("Exception thrown!");
            System.out.println(e.getMessage());
        }
        return passengers;
    }


    public Passenger savePassenger(Passenger passenger) {
        try {
            String sql = "INSERT INTO passenger (first_name, last_name, address, city, state, points) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, passenger.getFirst_name());
            statement.setString(2, passenger.getLast_name());
            statement.setString(3, passenger.getAddress());
            statement.setString(4, passenger.getCity());
            statement.setString(5, passenger.getState());
            statement.setInt(6, passenger.getPoints());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new passenger was inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return passenger;
    }


    public Boolean updatePassenger(Passenger passenger) {

        String sql = "UPDATE passenger " +
                     "SET first_name = ? " +
                     "WHERE id = ?;";

        int rowsUpdated = 0;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, passenger.getFirst_name());
            statement.setLong(2, passenger.getId());
            rowsUpdated = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (rowsUpdated > 0) {
            System.out.println("An existing passenger was updated successfully!");
            return true;
        }
        // rowsUpdated = 0 so nothing was updated
        return false;
    }


    public boolean deletePassenger(Long id) {
        try {
            String sql = "DELETE FROM passenger WHERE id = " + id + ";";
            PreparedStatement statement = connection.prepareStatement(sql);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A passenger was deleted successfully!");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Passenger> mapResultToPassenger(ResultSet resultSet) throws SQLException {
        List<Passenger> passengerList = new ArrayList<>();
        while (resultSet.next()) {
            Passenger passenger = new Passenger();
            passenger.setId(resultSet.getLong("id"));
            passenger.setFirst_name(resultSet.getString("first_name"));
            passenger.setLast_name(resultSet.getString("last_name"));
            passenger.setAddress(resultSet.getString("address"));
            passenger.setCity(resultSet.getString("city"));
            passenger.setState(resultSet.getString("state"));
            passenger.setPoints(resultSet.getInt("points"));
            passengerList.add(passenger);

            System.out.println(passenger);
        }
        return passengerList;

    }
}