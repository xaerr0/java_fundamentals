//package labs_examples.generics.labs.exercise3_2;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class GenPalindrome2 {
//
//    public static void main(String[] args) {
//        List<String> wordList = new ArrayList<>();
//        wordList.add("Rotator");
//        wordList.add("Square");
//        wordList.add("Madam");
//
//        Integer palindromeCount = palindromeCheck(wordList, );
//        System.out.println(palindromeCount);
//    }
//
//    public static <T> Integer palindromeCheck(List<T>, String str1) {
//        StringBuilder stringBuilder = new StringBuilder(str1);
//
//        String str2 = stringBuilder.reverse().toString();
//
//        if (str1.equalsIgnoreCase(str2)) {
//            System.out.println(str1 + "is a palindrome");
//        } else {
//            System.out.println(str1 + "is NOT a palindrome");
//        }
//        return null;
//    }
//}