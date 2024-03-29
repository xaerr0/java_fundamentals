package labs_examples.generics.labs.exercise3_3;

/**
 * 3)Write a generic method to exchange the positions of two different elements in an array.
 */

public class GenericArray {

//    @TODO Swap by Value

    public static <T> void arraySwapByIndex(T[] a, int i, int j) {
        T tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        Integer[] intList = {3, 5, 3, 9, 10};
        arraySwapByIndex(intList, 0, 4);
        for (Integer i : intList)
            System.out.print(i + ", ");

        System.out.println();

        String[] stringList = {"Dog", "Cat", "Squirrel", "Dinosaur", "ManbBearPig"};
        arraySwapByIndex(stringList, 1, 3);
        for (String str : stringList)
            System.out.print(str + ", ");

    }
}