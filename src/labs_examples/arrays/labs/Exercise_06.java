package labs_examples.arrays.labs;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse the nums[] array in place using only one extra variable. Please note,
 *      you cannot use a second array and you cannot instantiate any new variables in the class below.
 *
 *      Hint: you have two index
 *
 */
public class Exercise_06 {

    public static void main(String[] args){
//        int[] nums = {45, 87, 62, 99, 1, 42, 12};
        int[] nums = {1, 2, 3, 4, 5};

        int[] reverse = new int[nums.length];
        int temp;

        // Question: in the for loop below, why do we divide "nums.length" by 2?
        // Answer: Because we only need to swap half the length, if we swap the whole length, we will swap the length twice.

        for(int i = 0; i < nums.length / 2; i++){
            // swap elements at indexes in array
            // you have two indices readily available for you to use "i" (which increments) and "nums.length"
            // you've also got this "temp" variable you can use to hold a value temporarily

            temp = nums[i];
            int swap = nums.length - i - 1;
            nums[i] = nums[swap];
            nums[swap] = temp;
        }

//        // TODO: solve using a second array
        for (int i : reverse){
            System.out.println(i + " | ");
        }
//
//
        System.out.print("Contents of array after for loop - ");
        // print each element of the array to verify reverse order
        for(int j : nums){
            System.out.print(j + " | ");

        }


        }

        }





