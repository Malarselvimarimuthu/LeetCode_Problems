class Solution {
    public int rob(int[] nums) 
    {
       int n = nums.length-1; 
       int dp[] = new int[n+1];
       Arrays.fill(dp,-1);
       return helper(n,nums,dp);
    }

    public int helper(int ind,int[] nums,int[] dp)
    {
        if(ind == 0)
        {
            return nums[ind];
        }
        if(ind < 0)
        {
            return 0;
        }
        if(dp[ind] != -1) return dp[ind];
        int pick = nums[ind] + helper(ind-2,nums,dp); 
        int notPick = helper(ind-1,nums,dp);

        return dp[ind] = Math.max(pick,notPick); 
    }

    // dp [0,0,0,0,0]
    // [1,2,3,1]
    // if(ind == 0)
    // {
    //     return nums[ind];
    // }
    // if(ind <0)
    // {
    //     return 0;
    // }
    // int pick += helper(nums,ind-1);
    // int notPick += helper(nums, ind);
    // // Math.max(pick,)
    // return Math.max(pick,notPick);

}