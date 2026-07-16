class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0], profit = 0;

        for(int sell: prices) {
            profit = Math.max(profit, sell-minPrice);
            minPrice = Math.min(minPrice, sell);
        }

        return profit;
    }
}
