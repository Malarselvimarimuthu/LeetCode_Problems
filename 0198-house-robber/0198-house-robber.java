class Solution {
    public int rob(int[] nums) 
    {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return fun(n - 1,nums,dp);
    }
    public int fun(int ind,int[] nums,int[] dp)
    {
        if(ind == 0)
        {
            return nums[ind];
        }
        if(ind < 0)
        {
            return 0;
        }
        if(dp[ind] != -1)
        {
            return dp[ind];
        }
        int pick = nums[ind] + fun(ind-2 ,nums,dp);
        int notPick = fun(ind-1,nums,dp);
        dp[ind] = Math.max(pick,notPick);

        return Math.max(pick,notPick);
    }
}