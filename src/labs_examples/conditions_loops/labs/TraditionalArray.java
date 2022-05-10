package labs_examples.conditions_loops.labs;

import java.util.Arrays;

public class TraditionalArray {
    public static void main(String[] args) {



        int [] array = new int [10];
        array[0] = 5;
        array[0] = 0;


        System.out.println(array.length);
        System.out.println(array[0]);
        System.out.println(array[7]);
        System.out.println(array);

        printArray(array);


    }


    private static void printArray(int[] table) {
        for(int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " | ");
        }
    }
}

