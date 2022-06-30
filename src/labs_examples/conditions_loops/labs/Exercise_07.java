package labs_examples.conditions_loops.labs;

import java.util.Locale;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */
import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {

        //find first vowel
        //print out word and first vowel

        Scanner scan = new Scanner(System.in);

        System.out.print("Type in a word and I'll find the first vowel: ");
        String str = scan.nextLine();

        String vowels = "aeiouAEIOU";


//        //using .contains
//        //if character is not a vowel
//        if (str.length() > 0) {
//            int charLocation = 0;
//            while (charLocation < str.length() - 1 && !vowels.contains(Character.toString(str.charAt(charLocation)))) {
//                charLocation++;
//            }
//
//            if (vowels.contains(Character.toString(str.charAt(charLocation)))) {
//                System.out.println(str);
//                System.out.println(str.charAt(charLocation));
//            } else {
//                System.out.println("No vowels found!");
//            }
//        } else {
//            System.out.println("Empty string given!");
//        }

        //Alternative approach

        int vowelCount = 0;
        int charIndex = 0;
        while (vowelCount == 0) {
            char ch = str.charAt(charIndex);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else {
                charIndex++;
            }
        }

        System.out.println(str);
        System.out.println(str.charAt(charIndex));



    }
}