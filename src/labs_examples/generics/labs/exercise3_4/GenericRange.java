package labs_examples.generics.labs.exercise3_4;


import java.util.List;
//@TODO HALP!
/**
 * 4)Write a generic method to find the largest element within the range(begin,end)of a list.
 */

public class GenericRange {
    public static <T extends Comparable> T largestElement(List<T> list, int begin, int end) {

        T max = list.get(begin);
        for (int i = begin + 1; i < end; i++) {
            T elem1 = list.get(i);
            if (elem1.compareTo(max) > 0) {
                max = elem1;
            }
        }
        return max;


    }

    public static void main(String[] args) {
        Integer[] list = {4, 5, 844, 35, 194};
//        largestElement(list, 0,4);


    }

}