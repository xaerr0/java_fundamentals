package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 * <p>
 * Stream API Labs
 * <p>
 * 1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 * 2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 * 3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 * to get the sum of the modified list
 * 4) Demontrate the filter function by filtering out all Integers that are less than 10 - then use the average
 * function to average the remaining numbers, assign this result to an int variable.
 * 5) Demonstrate the reduce() function to determine the sum of a list of Integers
 * 6) Demontsrate how to Stream a text file and print out each line
 * 7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 * the print out the element at the 1 index for each array.
 * 8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 * the print out the sum of all elements at index 2.
 * 9) Demonstrate the anyMatch() function.
 * 10) Demonstrate the allMatch() function.
 * 11) Demonstrate the collect() terminal operation to store resulting values into a List
 */

class Example {
    public static void main(String[] args) throws IOException {





//    1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
        System.out.println("\n---------- Example 1 ------------");
        IntStream.range(1, 16) //TODO Do you have to always choose +1?
                .forEach(System.out::println);

//    2) Demonstrate the use of the sum function to determine the range of a set of numbers.
        System.out.println("\n---------- Example 2 ------------");
        int sum = IntStream.range(1, 4).sum();
        System.out.println(sum);

//    3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
        System.out.println("\n---------- Example 3 ------------");
        Arrays.stream(new int[] {3, 5, 4, 7})
                .map(x -> x + x) //@TODO How to do sum after this?
                .forEach(System.out::println);

//    4) Demonstrate the filter function by filtering out all Integers that are less than 10 - then use the average
        System.out.println("\n---------- Example 4 ------------");
        Arrays.stream(new int[] {34, 55, 4, 78, 9})
                .filter(x -> x > 10)
                .forEach(System.out::println);

//    5) Demonstrate the reduce() function to determine the sum of a list of Integers
        System.out.println("\n---------- Example 5 ------------");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sumNumbers = numbers.stream()
                .mapToInt(x -> x)
                .reduce(0, (x, y) -> x + y);
        System.out.println(sumNumbers);

        // declare paths to data files in this examples_files directory
        String bandsFile = "src/labs_examples/lambdas/examples/stream_api/example_files/bands.txt";
        String dataFile = "src/labs_examples/lambdas/examples/stream_api/example_files/data.txt";

//    6) Demonstrate how to Stream a text file and print out each line
        System.out.println("\n---------- Example 6 ------------");
        Stream<String> data = Files.lines(Paths.get(dataFile));
        data
                .forEach(System.out::println);
        data.close();

//   7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
//    then print out the element at the 1 index for each array.
        System.out.println("\n---------- Example 7 ------------");
        Stream<String> data2 = Files.lines(Paths.get(dataFile));
        data2
                .map(s -> s.split(","))
                .filter(s -> s.length == 3)
                .forEach(s -> System.out.println(s[1]));
        data2.close();


//   8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
//   then print out the sum of all elements at index 2.
        System.out.println("\n---------- Example 8 ------------");
        Stream<String> data3 = Files.lines(Paths.get(dataFile));

        double sumData =
                data3
                .map(s -> s.split(","))
                .filter(s -> s.length == 3)
                .map(s -> s[2])
                .mapToDouble(Double::parseDouble)
                .sum();

        System.out.println(sumData);




//   9) Demonstrate the anyMatch() function.
        System.out.println("\n---------- Example 9 ------------");
        Stream<String> band = Files.lines(Paths.get(bandsFile));

//        band
//                .anyMatch(s -> s.startsWith("E")) System.out.println();




//   10) Demonstrate the allMatch() function.

        System.out.println("\n---------- Example 10 ------------");




//   11) Demonstrate the collect() terminal operation to store resulting values into a List
        System.out.println("\n---------- Example 11 ------------");










    }
}