package labs_examples.generics.labs.exercise3_2;

import java.util.ArrayList;
import java.util.List;

///** 2)Write a generic method to count the number of elements in a"Collection" of Strings that are palindromes
// *
// */
//
public class GenericPalindrome {
    //

    public static void main(String[] args) {

        List<String> wordList = new ArrayList<>();
        wordList.add("Rotator");
        wordList.add("Square");
        wordList.add("Madam");

        Integer palindromeCount = palindromeCheck(wordList);
        System.out.println("There are " + palindromeCount + " palindromes in your list");

    }


    public static <T> Integer palindromeCheck(List<T> wordList) {

        StringBuilder sbWord = new StringBuilder();

        Integer count = 0;
        for (T word : wordList) {
            sbWord.append(word);

            String wordString = sbWord.toString();
            String revWord = sbWord.reverse().toString();

            if (wordString.equalsIgnoreCase(revWord)) {
                System.out.println(wordString + " is a palindrome");
                count++;
            } else {
                System.out.println(wordString + " is NOT a palindrome");
            }
            sbWord.setLength(0);
        }
        return count;
    }
}