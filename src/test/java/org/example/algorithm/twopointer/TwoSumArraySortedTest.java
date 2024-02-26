package org.example.algorithm.twopointer;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumArraySortedTest {

    @ParameterizedTest
    @MethodSource("sources")
    public void test(int[] a, int target, int[] expected) {
        var actual = new TwoSumArraySorted().twoSum(a, target);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}),
            Arguments.of(new int[]{2, 3, 4}, 6, new int[]{1, 3}),
            Arguments.of(new int[]{-1, 0}, -1, new int[]{1, 2})
        );
    }
}
