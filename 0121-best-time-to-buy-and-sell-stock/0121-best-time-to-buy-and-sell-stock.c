int maxProfit(int* prices, int pricesSize) 
{
    int profit = 0;
    int min = prices[0];
    for(int i=1 ; i<pricesSize ; i++)
    {
        int cost = prices[i] - min;
        if(cost > profit)
        {
            profit = cost;
        }
        if(min>prices[i])
        {
            min = prices[i];
        }
    }
    return profit;
}