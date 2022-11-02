package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;
import java.util.Map;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate you're mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        HashMap<Integer, String> numMap = new HashMap<>();
        // put()
        numMap.put(1, "one");
        numMap.put(2, "two");
        numMap.put(3, "three");
        numMap.put(4, "four");
        numMap.put(5, "five");

        // get()
        System.out.println(numMap.get(2));
        System.out.println(numMap.get(5));


        // putAll()
        HashMap<Integer, String> numMap2 = new HashMap<>();
        numMap2.put(6, "six");
        numMap2.put(7, "seven");
        numMap.putAll(numMap2);

        // size()
        System.out.println(numMap.size());

        //contains()
        System.out.println("Does numMap contain the value \"six\"? ");
        System.out.println(numMap.containsValue("six"));
        System.out.println("Does numMap contain the key \"3\"? ");
        System.out.println(numMap.containsKey(3));

        //keySet()
        System.out.println(numMap.keySet());


        //entrySet()
        System.out.println(numMap.entrySet());


        //putIfAbsent()
        numMap.putIfAbsent(8, "eight");
        System.out.println(numMap);


        //remove()
        numMap.remove(5);
        System.out.println(numMap);

        //replace()
        numMap.replace(4, "four REPLACED");
        System.out.println(numMap);

        //forEach()
        for (Map.Entry<Integer, String> entry : numMap.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());


        //clear()
        numMap.clear();
        System.out.println(numMap + "After clear()");
    }
}