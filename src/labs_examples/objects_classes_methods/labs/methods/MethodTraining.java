package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

// 1) Demonstrate method overloading in this class
public class MethodTraining {

    public static void main(String[] args) {
        int x = multiply(4, 4);
        int z = multiply((int) 3.2, (int) 2.3, (int) 1.1);

        System.out.println(x);
        System.out.println(z);


        // 2) Demonstrate the difference between "pass by value" and "pass by reference"

        //  Pass By Value
        int c = 5;
        int d = 4;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        passByValue(c, d);

        // #2
        int num = 1;
        System.out.println("number before = " + num);
        num = passByRef(num);
        System.out.println("number after = " + num);

        // #3
        max(7, 3, 46, 27);

        // #4
        consonants();

        // #5
        primeNum(11);

        // #6
        returnArray();

        // #7
        ArrayList<Integer> results = divisorTest(100, 4, 2);
        for(Integer i : results){
            System.out.println(i);
        }
    }


    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;

    }


    public static void passByValue(int c, int d) {
        c = c * 4;
        System.out.println("new c = " + c);
        d = d * 4;
        System.out.println("new d = " + d);

    }


    //   Pass By Reference
    public static int passByRef(int num) {
        num++;
        return num;


    }


    //    3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static void max(int a, int b, int c, int d) {

        if (a > b && a > c && a > d)
            System.out.println("The largest number is: " + a);
        else if (b > a && b > c && b > d)
            System.out.println("The largest number is: " + b);
        else if (c > a && c > b && c > d)
            System.out.println("The largest number is: " + c);
        else
            System.out.println("The largest number is: " + d);

    }

    //    4) Write a method to count all consonants (the opposite of vowels) in a String
    public static void consonants() {
        int count = 0;
        String sentence = "hello";


        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                System.out.println();
            } else if (ch != ' ') {
                count++;
            }
        }
        System.out.println("The number of consonants is: " + count);
    }

    //    5) Write a method that will determine whether or not a number is prime
//        recursion method

//    public static boolean primeNum(int n) {
//        if (n <= 1) {
//            System.out.println(n + " is not a prime number");
//            return false;
//        }
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                System.out.println(n + " is not a prime number");
//                return false;
//            }
//        }
//        System.out.println(n + " is a prime number");
//        return true;
//    }

    public static boolean primeNum(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                return false;
            }
        }
        System.out.println(n + " is a prime number");
        return true;
    }

//    6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
//            which is passed in as an argument

    public static void returnArray() {
        int[] myArray = {43, 63, 21, 47, 99};
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        int min = myArray[0];
        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] < min) {
                min = myArray[j];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

//          7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
//        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
//        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
//        length of the returned list


        public static ArrayList<Integer> divisorTest(int maxNum, int divisor1, int divisor2){
            ArrayList<Integer> arrayList = new ArrayList<>();

            for(int i = 0; i <= maxNum; i++){
                if(i % divisor1 == 0 && i % divisor2 == 0){
                    arrayList.add(i);
                }

            }
            return arrayList;

    }





//      8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
//    instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
//    variable is used to temporarily store individual values in the array

        public static void reverseArray(){
        int[] intArray = {10, 20, 30, 40 , 50};

        int temp;
            System.out.println("Original Array");
        for(int j: intArray) {
            System.out.print(j + " | ");
            System.out.println();
        }
        for (int i = 0; i < intArray.length / 2; i++) {
            temp = intArray[i];
            intArray[i] = intArray[intArray.length - i - 1];
            intArray[intArray.length - i - 1] = temp;
        }
            System.out.println("Reverse Array");
        for (int i : intArray){

            System.out.print(i + " | ");
        }
            }




        }







