class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0;i<=prices.length-2;i++){
            buyPrice = Math.min(buyPrice,prices[i]);
            int sellPrice = 0;
            if(prices[i+1]>buyPrice){
                sellPrice = prices[i+1];
            }
            profit = Math.max(profit,sellPrice-buyPrice);
        }
        return profit;
    }
}