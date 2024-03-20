package org.example.algorithm.slidingwindow;

public class BestTimeStock {

    public static void main(String[] args) {

//        var prices = new int[] { 7, 1, 5, 3, 6, 4 };
        var prices = new int[]{2, 4, 1};
        int minBuy = Integer.MAX_VALUE;
        int max = 0;
        for (int day = 0; day < prices.length; day++) {
            if (prices[day] < minBuy) {
                minBuy = prices[day];
                continue;
            }

            max = Math.max(max, prices[day] - minBuy);
        }

        System.out.println(max);
    }
}
