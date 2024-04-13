package org.example.algorithm.bit;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        // 1. N ^ N = 0; N ^ 0 = N
        // 2. N ^ M ^ N = (N ^ N) ^ M = M
        int n = 0;
        for (int num : nums) {
            n ^= num;
        }
        return n;
    }
}
