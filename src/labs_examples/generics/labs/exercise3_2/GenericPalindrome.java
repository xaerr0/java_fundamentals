package labs_examples.generics.labs.exercise3_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/** 2)Write a generic method to count the number of elements in a"Collection" of Strings that are palindromes
 *
 */

public class GenericPalindrome {

    public static void main(String[] args) {

        GenericPalindrome genPan = new GenericPalindrome();
        Collection<String> palindromeCheck = new ArrayList<>();
        palindromeCheck.add("Rotator");
        palindromeCheck.add("Square");
        palindromeCheck.add("Madam");
        palindromeCheck(palindromeCheck);


    }

    private void palindromeCheck() {
    }

    public static <T> boolean palindromeCheck(Collection<T> c) {
        List<T> list = new ArrayList<>(c);
        System.out.println(list);

        System.out.println(list);
        return list.equals(new ArrayList<>(c));
    }
}
//        String str;
//        String reverseStr = "";
//
//
//        for (int i = (str.length() - 1); i >= 0; i--) {
//            reverseStr = reverseStr + str.charAt(i);
//        }
//        if (str.equalsIgnoreCase(reverseStr)) {
//            System.out.println(str + " is a Palindrome");
//        } else {
//            System.out.println(str + " is not a Palindrome");
//        }
//
//    }