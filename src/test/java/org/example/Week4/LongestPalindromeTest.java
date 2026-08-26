package org.example.Week4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeTest {

    @ParameterizedTest
    @CsvSource({"ThelilGanster, lil", "banana, anana", "test, "})
    void checksumTest(String input, String expected) {
        String current = LongestPalindrome.findLongestPalindrome(input);
        assertEquals(expected, current);
    }
}
