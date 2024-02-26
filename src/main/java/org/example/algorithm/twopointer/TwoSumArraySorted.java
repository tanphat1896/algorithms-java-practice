package org.example.algorithm.twopointer;

public class TwoSumArraySorted {
    public int[] twoSum(int[] numbers, int target) {
        int smallIdx = 0, bigIdx = numbers.length - 1;

        while (smallIdx < bigIdx) { // two indexes must be distinct
            int sum = numbers[smallIdx] + numbers[bigIdx];
            if (sum == target) {
                return new int[] { smallIdx + 1, bigIdx + 1 };
            }

            if (sum > target) { // too large, decrease the big number
                bigIdx--;
            }

            if (sum < target) { // too small, increase the small number
                smallIdx++;
            }
        }

        throw new IllegalArgumentException("No solution");
    }
}
