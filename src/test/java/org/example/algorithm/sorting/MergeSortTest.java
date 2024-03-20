package org.example.algorithm.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {

    @Test
    public void test1() {
        int[] nums = new int[]{4, 1, 4, 4, 5, 7, 1, 2};
        int[] exps = new int[]{1, 1, 2, 4, 4, 4, 5, 7};
        assertThat(exps).containsExactly(new MergeSort().sort(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 1};
        int[] exps = new int[]{1, 1};
        assertThat(exps).containsExactly(new MergeSort().sort(nums));
    }

    @Test
    public void test3() {
        int[] nums = IntStream.range(0, 10_000_000).map(i -> new Random().nextInt()).toArray();
        int[] expected = new int[nums.length];
        System.arraycopy(nums, 0, expected, 0, nums.length);
        Arrays.sort(expected);
        new MergeSort().sort(nums);

        for (int i = 0; i < nums.length; i++) {
            assertEquals(
                nums[i],
                expected[i]
            );
        }
    }
}
