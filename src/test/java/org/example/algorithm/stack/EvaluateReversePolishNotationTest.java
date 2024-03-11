package org.example.algorithm.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluateReversePolishNotationTest {

    @ParameterizedTest
    @MethodSource("sources")
    public void test(String[] tokens, int expected) {
        assertEquals(expected, new EvaluateReversePolishNotation().evalRPN(tokens));
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(new String[]{"2", "1", "+", "3", "*"}, 9),
            Arguments.of(new String[]{"4", "13", "5", "/", "+"}, 6),
            Arguments.of(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}, 22)
        );
    }
}
