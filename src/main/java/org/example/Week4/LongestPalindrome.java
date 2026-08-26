package org.example.Week4;

import java.util.*;

public class LongestPalindrome {
    public static void main(String[] args) {

        String s = "The lil Ganster";

        System.out.println(findLongestPalindrome(s));
    }

//    Write a Java program that takes a string and finds the longest contiguous substring that reads the same forwards and backwards.
//      Beispiel:
//          input = racecarcrash
//          output = racecar

    public static String findLongestPalindrome(String input) {

        input = input.toLowerCase(Locale.ROOT);
        input = input.replace(" ", "");

        List<String> palindromesInWord = new ArrayList<String>() {};


        for (int startIndex = 0; startIndex < input.length() - 1; startIndex++) {

            for (int lastIndexToAdd = startIndex + 1; lastIndexToAdd <= input.length() - 1; lastIndexToAdd++) {

                String textToProofPalindrome = input.substring(startIndex, lastIndexToAdd + 1);

                int amountOfNumbersForPalindromeCheck = textToProofPalindrome.length() / 2;

//                The problem is at the line 35. It doesn't check right if it equals
                if (textToProofPalindrome.substring(startIndex, amountOfNumbersForPalindromeCheck).equals(textToProofPalindrome.substring(amountOfNumbersForPalindromeCheck + 1))) {
                    palindromesInWord.add(textToProofPalindrome);
                }
            }
        }

        String result = Collections.max(palindromesInWord, Comparator.comparingInt(String::length));


        return  result;
    }

}


