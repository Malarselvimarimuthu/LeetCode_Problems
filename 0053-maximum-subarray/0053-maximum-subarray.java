class Solution {
    public int maxSubArray(int[] nums) 
    {
        int sum = 0;
        int max = nums[0];
        for(int x:nums)
        {
            if(sum<0) sum = 0;
            sum+=x;
            max = Math.max(sum,max);
        }
        return max;
    }
}