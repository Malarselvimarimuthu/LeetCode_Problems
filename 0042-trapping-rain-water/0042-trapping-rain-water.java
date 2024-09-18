class Solution {
    public int trap(int[] height) 
    {
        int left = 0;
        int right = height.length - 1;
        int sum = 0;
        int lmax = height[left];
        int rmax = height[right];
        while(left<right)
        {
            if(lmax<=rmax)
            {
                sum += lmax - height[left];
                left++;
                lmax = Math.max(lmax,height[left]);
                
            }
            else
            {
                sum += rmax - height[right];
                right--;
                rmax = Math.max(rmax,height[right]);
                
            }
        } 
        return sum;   
    }
}