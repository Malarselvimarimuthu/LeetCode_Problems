class Solution {
    public int thirdMax(int[] nums) 
    {
        long fmax=Long.MIN_VALUE;
        long smax=Long.MIN_VALUE;
        long tmax=Long.MIN_VALUE;
        for(long x:nums)
        {
            if(fmax<x)
            {
                tmax = smax;
                smax = fmax;
                fmax = x;
            }
            else if(fmax>x && smax<x)
            {
                tmax = smax;
                smax = x;
            }
            else if(smax>x && tmax<x)
            {
                tmax = x;
            }
        }
        return (tmax!=Long.MIN_VALUE)?(int)tmax:(int)fmax;
    }
}