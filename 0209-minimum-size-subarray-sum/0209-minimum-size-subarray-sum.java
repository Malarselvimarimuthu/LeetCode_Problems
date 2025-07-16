class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        int start = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++)
        {
            sum += nums[right];

            while(sum >= target)
            {
                minLen = Math.min(minLen, right-start+1);
                sum -= nums[start];
                start++;
            }
        }
        return (minLen==Integer.MAX_VALUE)?0:minLen;
    }
}