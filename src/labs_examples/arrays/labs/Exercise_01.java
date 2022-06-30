package labs_examples.arrays.labs;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        int[] array = {1, 4, 53, 32, 2, 7, 12, 6, 8, 3};
        int sum = 0;

        for (int i : array) {
            sum += i;
        }
        int avg = sum / 10;


        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + avg);



    }



}