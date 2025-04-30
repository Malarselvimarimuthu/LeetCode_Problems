import java.util.*;
class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int dp[] = new int[len];
        Arrays.fill(dp,len);
        return maxJump(nums,dp);
    }
    public boolean maxJump(int[] nums,int[] dp)
    {
        dp[0] = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<=nums[i];j++){
                if(i+j<nums.length){
                dp[i+j] = Math.min(dp[i+j],dp[i]+1);
                }
            }
        }
        if(dp[nums.length-1]==nums.length) return false;
        return true;
    }
}