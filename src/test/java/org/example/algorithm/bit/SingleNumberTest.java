package org.example.algorithm.bit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {

    @ParameterizedTest
    @MethodSource("sources")
    public void test(int[] nums, int expected) {
        assertEquals(expected, new SingleNumber().singleNumber(nums));
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(new int[]{2, 1, 2}, 1),
            Arguments.of(new int[]{4, 1, 2, 1, 2}, 4),
            Arguments.of(new int[]{1}, 1)
        );
    }
}
