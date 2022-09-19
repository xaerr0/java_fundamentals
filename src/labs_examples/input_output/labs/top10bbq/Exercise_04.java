package labs_examples.input_output.labs.top10bbq;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 * package, create a new application that will parse a custom CSV file that you created and map each line of the
 * csv to a custom POJO that you create.
 * <p>
 * Then add that object to an arraylist. After you have mapped each row of the csv to objects
 * and added each object to an arraylist, print out each object using the objects custom toString() method.
 * <p>
 * Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 */

public class Exercise_04 {
    public static void main(String[] args) throws IOException {

        ArrayList<Restaurant> restaurants = new ArrayList<>();

        String filePath = "src\\labs_examples\\input_output\\labs\\top10bbq\\top10bbq.csv";
        String filePath2 = "src\\labs_examples\\input_output\\labs\\top10bbq\\top10bbqArrayListToCSV.csv";
        String filePath3 = "src\\labs_examples\\input_output\\labs\\top10bbq\\top10bbqArrayListToCSVReverse.csv";


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                restaurants.add(mapValuesToBbqObject(values));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Reverse Array and Write
        try (PrintWriter writer = new PrintWriter(filePath3)) {

            restaurants.sort(Comparator.comparing(Restaurant::getRank));

            for (Restaurant restaurant : restaurants) {

                writer.write(restaurant.toCSV() + "\r");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    private static Restaurant mapValuesToBbqObject(String[] values) {

        values = removeSpaces(values);
        Restaurant restaurant = new Restaurant();

        restaurant.setRank(Integer.parseInt(values[0]));
        restaurant.setName(values[1]);
        restaurant.setAddress(values[2]);
        restaurant.setCity(values[3]);
        restaurant.setPhoneNum(values[4]);
        restaurant.setHours(values[5]);


        return restaurant;

    }

    private static String[] removeSpaces(String[] array) {

        String[] results = new String[array.length];

        for (int i = 0; i < results.length; i++) {
            results[i] = array[i].trim();
        }

        return results;
    }

}

