package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number 1 - 10: ");
        int num = scan.nextInt();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                index = i;

            }
        }
        if (index == -1) {
            System.out.println(num + " was not found");
        }else{
            System.out.println(num + " is at index: " + index);
        }



    }

}