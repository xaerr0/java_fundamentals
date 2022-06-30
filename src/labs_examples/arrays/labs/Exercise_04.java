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
        dogs[0] = new int[]{1, 2, 3};
        dogs[1] = new int[]{4, 5, 6, 7};
        dogs[2] = new int[]{4, 5};


        for (int[] dog : dogs) {
            for (int i : dog) {
                System.out.println(i);
            }
        }


    }
}





