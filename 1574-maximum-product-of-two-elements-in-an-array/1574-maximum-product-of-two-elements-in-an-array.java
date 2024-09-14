class Solution {
    public int maxProduct(int[] nums) 
    {
        int fmax = 1;
        int smax = 1;
        for(int i=0;i<nums.length;i++)
        {
            if(fmax<=nums[i])
            {
                smax = fmax;
                fmax = nums[i];
            }
            else if(nums[i]>smax)
            {
                smax = nums[i];
            }
        }
        System.out.println(smax+" "+fmax);
        return (fmax-1)*(smax-1);
    }
}