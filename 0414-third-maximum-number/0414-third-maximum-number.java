class Solution {
    public int thirdMax(int[] nums) 
    {
        Integer fmax=null;
        Integer smax=null;
        Integer tmax=null;
        for(Integer x:nums)
        {
            if((x.equals(fmax)) || (x.equals(smax)) || (x.equals(tmax))) continue;
            if(fmax==null || fmax<x)
            {
                tmax = smax;
                smax = fmax;
                fmax = x;
            }
            else if(smax==null || smax<x)
            {
                tmax = smax;
                smax = x;
            }
            else if(tmax==null || tmax<x)
            {
                tmax = x;
            }
        }
        return tmax==null?fmax:tmax;
    }
}