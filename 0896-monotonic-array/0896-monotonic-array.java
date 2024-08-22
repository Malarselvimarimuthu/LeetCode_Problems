class Solution {
    public boolean isMonotonic(int[] nums) 
    {
        int c1= 0,c2=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>=nums[i+1])
            {
                c1++;
            }
            if(nums[i]<=nums[i+1])
            {
                c2++;
            }
        }
        if(c1==nums.length-1 || c2==nums.length-1)
            return true;
        return false;    
    }
}