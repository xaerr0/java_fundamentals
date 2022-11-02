package mysql.labs.air_travel_db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AirportService {

    DatabaseConnection databaseConnection;
    Connection connection;
    ResultSet resultSet;

    public AirportService() {
        databaseConnection = new DatabaseConnection("air_travel");
        connection = databaseConnection.getConnection();
    }


    public Airport getAirport(Long id) {
        String sql = "SELECT * FROM airport WHERE id = " + id + ";";
        Airport airport = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            airport = mapToAirport(resultSet).get(0);
            statement.close();
        } catch (SQLException e) {
            System.out.println("Exception thrown!");
            System.out.println(e.getMessage());
        }
        return airport;
    }


    public List<Airport> getAllAirports() {
        String sql = "SELECT * FROM airport";
        List<Airport> airports = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            airports = mapToAirport(resultSet);
            statement.close();
        } catch (SQLException e) {
            System.out.println("Exception thrown!");
            System.out.println(e.getMessage());
        }
        return airports;
    }


    public Airport saveAirport(Airport airport) {
        try {
            String sql = "INSERT INTO airport (name, iata) VALUES (? ,?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, airport.getName());
            statement.setString(2, airport.getIata());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("a new airport was inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return airport;
    }


    public Boolean updateAirport(Airport airport) {
        String sql = "UPDATE airport SET name = ? WHERE id = ?";

        int rowsUpdated = 0;

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, airport.getName());
            statement.setString(2, airport.getIata());
            rowsUpdated = statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (rowsUpdated > 0) {
            System.out.println("An existing airport was updated successfully!");
            return true;
        }
        return false;
    }


    public Boolean deleteAirport(Long id) {
        try {
            String sql = "DELETE FROM airport WHERE id = " + id + ";";
            PreparedStatement statement = connection.prepareStatement(sql);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("An airport was deleted successfully!");
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }


    public List<Airport> mapToAirport(ResultSet resultSet) throws SQLException {
        List<Airport> airportList = new ArrayList<>();
        while (resultSet.next()) {
            Airport airport = new Airport();
            airport.setId(resultSet.getLong("id"));
            airport.setName(resultSet.getString("name"));
            airport.setIata(resultSet.getString("iata"));
            airportList.add(airport);

            System.out.println(airport);
        }
        return airportList;
    }


}