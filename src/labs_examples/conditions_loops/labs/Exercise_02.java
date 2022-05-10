package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */


public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)

        Scanner scanner = new Scanner(System.in);

        // 2) prompt user

//        System.out.println("Enter your weekday number (1 - 7): ");

        // 3) assign input to variable as int

//        int day = scanner.nextInt();

        // 4) write completed code here
        boolean running = true;

        while (running){
            System.out.println("Enter your weekday number (1 - 7): ");
            int day = scanner.nextInt();
            if (day == 1) {
                System.out.println("Monday");
                running = false;
            } else if (day == 2) {
                System.out.println("Tuesday");
//                running = false;
            } else if (day == 3) {
                System.out.println("Wednesday");
//                running = false;
            } else if (day == 4) {
                System.out.println("Thursday");
//                running = false;
            } else if (day == 5) {
                System.out.println("Friday");
//                running = false;
            } else if (day == 6) {
                System.out.println("Saturday");
//                running = false;
            } else if (day == 7) {
                System.out.println("Sunday");
//                running = false;
            } else {
                System.out.println("WRONG!");
            }
            // if input is good
            if (day <= 7 && day >= 1){
            // exit the loop
                running = false;
            }

        }

    }
}
