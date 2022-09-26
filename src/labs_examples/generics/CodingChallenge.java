package labs_examples.generics;

/** The method getMax() below returns the highest of 3 int numbers.

 Using generics and bounded types, make it return the highest number of any type.

 Hint: You will need to bound the generics to those that extend Comparable

 Hint 2: Comparison operands like < or > won't work. You will need to compare the numbers using the compareTo()
 method.
 */


public class CodingChallenge {

    public static <T extends Comparable<T>> T getMax(T x, T y, T z)  {
        T max = x;   // assume x is initially the largest

        if(x.compareTo(y) > 0) {
            max = y;   // y is the largest so far
        }

        if(z.compareTo(y) > 0) {
            max = z;   // z is the largest now
        }
        return max;   // returns the largest object
    }
}