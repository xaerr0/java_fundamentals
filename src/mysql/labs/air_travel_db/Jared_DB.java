//package mysql.labs.air_travel_db;
//package mysql.examples;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//public class J_Database {
//
//    private final String schema;
//
//    DatabaseConnection databaseConnection;
//    Connection connection;
//
//    public J_Database(String schema) {
//        this.schema = schema;
//        databaseConnection = new DatabaseConnection(schema);
//        connection = databaseConnection.getConnection();
//    }
//
//    public List<Passenger> getAllPassengers() {
//        String query = "SELECT * FROM " + schema + ".passengers";
//        List<Passenger> passengers = new ArrayList<>();
//        try  {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//            passengers = mapPassengersFromResults(resultSet);
//            statement.close();
//        } catch (SQLException e) {
//            System.out.println("Exception thrown!");
//            System.out.println(e.getMessage());
//        }
//        return passengers;
//    }
//
//    public List<Passenger> mapPassengersFromResults(ResultSet resultSet) throws SQLException {
//        List<Passenger> passengerList = new ArrayList<>();
//        while (resultSet.next()) {
//            //map result to new object
//            Passenger passenger = new Passenger();
//            passenger.setName(resultSet.getString("name"));
//            //...
//            //set other fields as well
//            //...
//            //add passenger to list
//            passengerList.add(passenger);
//        }
//        return passengerList;
//    }
//}