package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int[][] dogs = new int[3][];


        for (int i = 0; i < dogs.length; i++) {
            for (int j = 0; j < dogs[i].length; j++) {
                dogs[i][j] = i * j;
                System.out.println(dogs);
            }
        }


    }
}





