package org.example.algorithm.twopointer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {

    @ParameterizedTest
    @MethodSource("sources")
    public void test(int[] a, int expected) {
        var actual = new ContainerWithMostWater().maxArea(a);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
            Arguments.of(new int[]{1, 1}, 1),
            Arguments.of(new int[]{1, 3, 2, 7, 10, 1, 7, 3, 1}, 21),
            Arguments.of(new int[]{1,3,2,5,25,24,5}, 24),
            Arguments.of(new int[]{0, 0}, 0)
        );
    }
}
