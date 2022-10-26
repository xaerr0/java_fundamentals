package mysql.labs.air_travel_db;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        PassengerService passengerService = new PassengerService();
        AirportService airportService = new AirportService();

        Airport airport1 = new Airport();

//        List<Airport> airports = airportService.getAllAirports();

        Airport airport2 = airportService.getAirport(3L);


        Airport airport12 = new Airport();
        airport12.setName("Made up Airport Int'l");
        airport12.setIata("POO");

//        airportService.saveAirport(airport12);

        Airport airport13 = new Airport("Fake Airport", "NAW");
        airportService.saveAirport(airport13);

//        Passenger passenger1 = new Passenger();
//        passenger1.setFirst_name("Anna");
//        passenger1.setLast_name("Sassin");
//        passenger1.setAddress("123 blank st");
//        passenger1.setCity("Las Vegas");
//        passenger1.setState("NV");
//        passenger1.setPoints(4000);
//
//        Passenger passenger2 = new Passenger("Carl", "Weathers", "123 handball ct", "Hayward", "CA", 431);
//
//        passengerService.savePassenger(passenger1);
//        passengerService.savePassenger(passenger2);


//        Passenger passenger3 = passengerService.getPassenger(1L);
//        Passenger passenger4 = passengerService.getPassenger(3L);

//        List<Passenger> passengers = passengerService.getAllPassengers();


//        passenger4.setFirst_name("Fred");
//        if (passengerService.updatePassenger(passenger4)) {
//            System.out.println("Successfully updated!");
//        } else {
//            System.out.println("Problem updating");
//        }
//
//
//        Passenger passenger5 = new Passenger();
//        passenger5.setId(1000L);
//        passenger5.setFirst_name("Paul");
//        if (passengerService.updatePassenger(passenger5)) {
//            System.out.println("Successfully updated!");
//        } else {
//            System.out.println("Problem updating");
//        }
//
//
//        if (passengerService.deletePassenger(9L)) {
//            System.out.println("Passenger successfully deleted!");
//        } else {
//            System.out.println("Problem deleting");
//        }
//

        System.out.println("test");







    }
}