class Solution {
    public int maxProfit(int[] prices) 
    {
        int min = prices[0];
        int cost = 0;
        int profit = 0;
        for(int x:prices)
        {
            cost = x - min;
            if(profit<cost)
                profit = cost;
            if(x<min)
                min = x;    
        }
        return profit;
    }
}