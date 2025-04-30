class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int dp[] = new int[len];
    
        Arrays.fill(dp,len);
        dp[0] = 0;
        for(int i=0;i<len;i++){
            for(int j=1;j<=nums[i];j++){
                if(i+j < len)
                {
                dp[i+j] = Math.min(dp[i+j],dp[i]+1);
                }
            }
        }
        // if(dp[len-1] == len) return -1;
        return dp[len-1];
    }
}   