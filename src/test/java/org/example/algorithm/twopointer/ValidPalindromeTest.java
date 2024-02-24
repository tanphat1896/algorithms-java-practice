package org.example.algorithm.twopointer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPalindromeTest {
    @ParameterizedTest
    @CsvSource(delimiter = ';', value = {
        "A man, a plan, a canal: Panama;true",
        "race a car;false",
        "' ';true",
        ".........;true",
        "......a...;true",
        "0P;false",
    })
    public void test(String s, boolean isValid) {
        assertEquals(isValid, new ValidPalindrome().validPalindrome(s));
    }
}
