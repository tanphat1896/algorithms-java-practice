package org.example.algorithm.arrayhash;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            var index = map.get(target - nums[i]);
            if (index != null) {
                return new int[]{index, i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException();
    }
}
