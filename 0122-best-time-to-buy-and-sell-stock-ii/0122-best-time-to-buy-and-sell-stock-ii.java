class Solution {
    public int maxProfit(int[] prices) 
    {
        int n = prices.length;
        int buy = prices[0];
        int left = 0;
        int right = 1;
        int profit = 0;
        while(left<n && right<n)
        {
            if(prices[left]<prices[right])
            {
              profit += prices[right] - prices[left];
            }
            left++;
            right++;
        }
        return profit;
    }
}