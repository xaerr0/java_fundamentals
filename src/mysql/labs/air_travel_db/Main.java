package mysql.labs.air_travel_db;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

//        Database database = new Database("passenger");

//        database.readPassenger();
//        database.insertPassenger();
//        database.updatePassenger();
//        database.deletePassenger();

        Database database = new Database("airport");

        database.readAirport();
//        database.insertAirport();
//        database.updateAirport();
//        database.deleteAirport();


//        List<Passenger> passengers = database.getAllPassengers();

    }
}