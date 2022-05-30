package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

        int x = multiply(4, 5);
        System.out.println(x);

        badJoke();

        long z = secYear(2);
        System.out.println(z);

        x = getArrayLength("String", "String 2");
        System.out.println(x);

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    public static int multiply(int a, int b) {
        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {
        return a / b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console
    public static void badJoke() {
        System.out.println("What did the baby computer call his father? Data!");

    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static long secYear(int year) {
        int day;
        int hour;
        int min;
        long sec;

        day = 365;
        hour = 24;
        min = 60;
        sec = year * (day * hour * min * 60);

        return sec;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int getArrayLength(String... args) {

        return args.length;
    }


}
