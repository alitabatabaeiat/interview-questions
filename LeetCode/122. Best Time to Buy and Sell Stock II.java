class Solution {
    public int maxProfit(int[] prices) {
        // My Solution

        // int min = Integer.MAX_VALUE;
        // int maxProfit = 0;
        // int maxProfitChunk = 0;

        // for (int i = 0; i < prices.length; i++) {
        // if (maxProfitChunk == 0 && prices[i] < min) {
        // min = prices[i];
        // } else if (prices[i] - min > maxProfitChunk) {
        // maxProfitChunk = prices[i] - min;
        // } else {
        // maxProfit += maxProfitChunk;
        // maxProfitChunk = 0;
        // min = prices[i];
        // }
        // }

        // return maxProfit + maxProfitChunk;

        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
