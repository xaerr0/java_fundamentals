package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int[][] multiArray = new int [5][5];
        for (int i = 1; i < multiArray.length; i++) {

            for(int j = 3; j < multiArray[i].length; j++) {
                multiArray[i][j] = i * j;
                System.out.println(multiArray[i][j] + " - ");




            }
        }

        
    }
}
