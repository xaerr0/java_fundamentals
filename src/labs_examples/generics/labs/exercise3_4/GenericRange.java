package labs_examples.generics.labs.exercise3_4;


import java.util.List;


/**
 * 4)Write a generic method to find the largest element within the range(begin,end)of a list.
 */

public class GenericRange {

    public static void main(String[] args) {
        List<Integer> list = List.of(4, 5, 844, 35, 194);

        GenericRange gr = new GenericRange();
        Integer results = largestElement(list);
        System.out.println(results);

        System.out.println(largestElement(list));
    }

    public static <T extends Comparable> T largestElement(List<T> list) {
        T prevElem = null;
        T largestElem = null;

        for (T element : list) {
            if (prevElem != null) {
                if (element.compareTo(largestElem) > 0) {
                    largestElem = element;
                }
            } else {
                largestElem = element;
            }
            prevElem = element;
        }
        return largestElem;

//        T maxElem = list.get(min);
//        for (int i = min + 1; i < max; i++) {
//            T elem1 = list.get(i);
//            if (elem1.compareTo(maxElem) > 0) {
//                maxElem = elem1;
//            }
//        }
//        return maxElem;


    }

    public void minMax() {
        int arr[] = {4, 5, 844, 35, 194};

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                System.out.println(min + " is the smallest number");
            }

            if (arr[i] > max) {
                max = arr[i];
                System.out.println(max + " is the largest number");
            }
        }
    }

}

//    public class GenericRange {
//
//        public static void main(String[] args) {
//            //[] should be on the type, not the variable name
//            Integer[] arr = {4, 5, 844, 35, 194};
//            Double[] doubleArr = {3.4, 9.55, 544.65, 23D, 58.1, 1.1};
//            Double[] minMax = minMax(arr);
//            System.out.println("The smallest Integer is: " + minMax[0]);
//            System.out.println("The largest Integer is: " + minMax[1]);
//            minMax = minMax(doubleArr);
//            System.out.println("The smallest Double is: " + minMax[0]);
//            System.out.println("The largest Double is: " + minMax[1]);
//        }
//
//        public static <T extends Number> Double[] minMax(T[] arr) {
//
//            Double min = arr[0].doubleValue();
//            Double max = arr[0].doubleValue();
//
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i].doubleValue() < min) {
//                    min = arr[i].doubleValue();
//                }
//
//                if (arr[i].doubleValue() > max) {
//                    max = arr[i].doubleValue();
//                }
//            }
//            return new Double[] {min, max};
//        }
//    }