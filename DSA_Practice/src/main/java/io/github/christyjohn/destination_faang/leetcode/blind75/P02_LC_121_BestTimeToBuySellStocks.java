package io.github.christyjohn.destination_faang.leetcode.blind75;

public class P02_LC_121_BestTimeToBuySellStocks {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
        System.out.println(maxProfit(new int[] { 1, 2 }));
        System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4, 9, 34 }));
        System.out.println(maxProfit(new int[] { 7, 3, 5, 103, 6, 4, 9, 34, 206, 1, 205 }));
        System.out.println(maxProfit(new int[] { 7, 6, 4, 3, 1 }));
    }

    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy)
                buy = prices[i];

            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }
}
