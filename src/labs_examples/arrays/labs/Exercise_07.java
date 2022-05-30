package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>();

        food.add("Hamburger");
        food.add("Pizza");
        food.add("Lasagna");
        food.add("Ribs");

        // remove
        food.remove("Pizza");



        // if the list is not empty
        if(!food.isEmpty()){

            for (String s : food){
                System.out.println(s + " ");
            }
            // index of an object
            System.out.println(food.indexOf("Ribs"));
        }

    }
}
