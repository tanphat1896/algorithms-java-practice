package org.example.algorithm.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/3sum/description/">Leetcode</a>
 */
public class Triplet {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        var result = new ArrayList<List<Integer>>();

        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int f = i + 1, t = len - 1;
            while (f < t) {
                int sum = nums[i] + nums[f] + nums[t];

                if (sum > 0) {
                    t--;
                    continue;
                }

                if (sum < 0) {
                    f++;
                    continue;
                }

                result.add(List.of(nums[i], nums[f], nums[t]));

                while (f < t && nums[f] == nums[f+1]) f++;
                while (f < t && nums[t] == nums[t-1]) t--;

                f++;
                t--;
            }
        }

        return result;
    }
}
