package labs_examples.input_output.labs.top10bbq;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**complete BBQListToCSV, to read in csv content to array, then reverse array and write to new file*/
//TODO SEE EXAMPLE 4!

public class BBQListToCSV {
    public static void main(String[] args) throws IOException {

        BufferedReader in = null;
        ArrayList<Restaurant> restaurants = new ArrayList<>();

        String filePath = "src\\labs_examples\\input_output\\labs\\top10bbq\\top10bbq.csv";
        String out = "src\\labs_examples\\input_output\\labs\\top10bbq\\top10bbq1to10.csv";


        //Reading Top 10 BBQ List
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();

            while (line != null) {
                String[] values = line.split(",");
                restaurants.add(mapValuesToBbqObject(values));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Writing


        try (PrintWriter writer = new PrintWriter(out)) {


            int s = restaurants.size();
            for (int i = 0; i < s; i++) {
                //Print test
                System.out.println(restaurants.get(i).toString() + "\r");
                //Write to file
//                writer.write(restaurants.get(i).toString() + "\r");
            }
            } catch (IOException e) {
            e.printStackTrace();
        }
//        restaurants.sort(Comparator.comparing(Restaurant::getRank));
//        restaurants.forEach(System.out::println);




    }




    private static Restaurant mapValuesToBbqObject(String[] values) {

        Restaurant restaurant = new Restaurant();

        restaurant.setRank(Integer.parseInt(values[0]));
        restaurant.setName(values[1]);
        restaurant.setAddress(values[2]);
        restaurant.setCity(values[3]);
        restaurant.setPhoneNum(values[4]);
        restaurant.setHours(values[5]);


        return restaurant;



            }

        }


