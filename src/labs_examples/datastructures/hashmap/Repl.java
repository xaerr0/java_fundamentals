package labs_examples.datastructures.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Repl {

    public static void main(String[] args) {
        HashMap<String, Integer> cityPopulations = new HashMap();

        // add several cities (key )and their populations (value )to the HashMap
        cityPopulations.put("Freeport City", 5);
        cityPopulations.put("Vernon", 112);
        cityPopulations.put("Caliente", 1130);
        cityPopulations.put("Whites City", 147);
        cityPopulations.put("Akhiok", 70);

        // retrieve the population of each city using the key
        System.out.println(cityPopulations.get("Freeport City"));
        System.out.println(cityPopulations.get("Vernon"));
        System.out.println(cityPopulations.get("Caliente"));
        System.out.println(cityPopulations.get("Whites City"));
        System.out.println(cityPopulations.get("Akhiok"));
        // print each element (key and value) in the HashMap

        Set entries = cityPopulations.entrySet();
        Iterator iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry city = (Map.Entry)iterator.next();
            System.out.println("The key is: " + city.getKey() + "The value is: " + city.getValue().toString());

        }




        // demonstrate at least 3 other HashMap methods

        boolean b1 = cityPopulations.containsKey("Caliente");
        System.out.println("Does hashmap contain \"Caliente\"? = " + b1);
        System.out.println("The size of the hashmap is = " + cityPopulations.size());
        cityPopulations.remove("Whites City");
        System.out.println("Updated list of elements = " + cityPopulations);
    }
}