class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int max = 0;
        int profit = 0;

        for(int i=0;i<n;i++){

            if(prices[i]<min){
                min = prices[i];
                max = prices[i];
            }

            max = Math.max(prices[i],max);
            profit = Math.max(max - min, profit);
            

        }
        return profit;
    }
}
