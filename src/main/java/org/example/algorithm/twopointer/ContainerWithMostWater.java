package org.example.algorithm.twopointer;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int low = 0, high = height.length - 1;
        int max = 0;

        while (low < high) {
            int minH = Math.min(height[low], height[high]);
            max = Math.max((high - low) * minH, max);

            while (low < high && height[low] <= minH) {
                low++;
            }

            while (high > low && height[high] <= minH) {
                high--;
            }
        }

        return max;
    }
}
