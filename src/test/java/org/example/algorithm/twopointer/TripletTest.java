package org.example.algorithm.twopointer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripletTest {


    @ParameterizedTest
    @MethodSource("sources")
    public void test(int[] a, List<List<Integer>> expected) {
        var actual = new Triplet().threeSum(a);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
            Arguments.of(new int[]{0, 1, 1}, List.of()),
            Arguments.of(new int[]{0, 0, 0}, List.of(List.of(0, 0, 0))),
            Arguments.of(new int[]{0, 0, 0, 0}, List.of(List.of(0, 0, 0))),
            Arguments.of(new int[]{0, 0}, List.of()),
            Arguments.of(new int[]{0, 0, 0, 0, 0, 0, 0}, List.of(List.of(0, 0, 0))),
            Arguments.of(new int[]{-2, 0, 1, 1, 2}, List.of(List.of(-2, 0, 2), List.of(-2, 1, 1))),
            Arguments.of(new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6}, List.of(List.of(-4, -2, 6), List.of(-4, 0, 4), List.of(-4, 1, 3), List.of(-4, 2, 2), List.of(-2, -2, 4), List.of(-2, 0, 2)))

        );
    }
}
