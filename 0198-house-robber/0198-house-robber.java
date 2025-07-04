class Solution {
    public int rob(int[] nums) {
        
        // Tabulization
        int n = nums.length;

        int dp[] = new int[n];
        dp[0] = nums[0];
        for(int i=1;i<n;i++)
        {
           
            int pick = nums[i] ;
            if(i>1)
            {
                pick += dp[i-2];
            }
            int notPick = dp[i-1];

            dp[i] = Math.max(pick,notPick);
        }
        return dp[n-1];
    }
}