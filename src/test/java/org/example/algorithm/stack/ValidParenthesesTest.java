package org.example.algorithm.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidParenthesesTest {

    @ParameterizedTest
    @CsvSource({
        "(),true",
        "()[]{},true",
        "(],false",
        "(((({[]}(){})[]))),true",
        "(((({[]}(){})[)])),false",
    })
    public void test(String s, boolean expected) {
        assertEquals(expected, new ValidParentheses().isValid(s));
    }
}
