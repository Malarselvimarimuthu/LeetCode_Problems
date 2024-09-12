class Solution {
    public int maxArea(int[] height) 
    {
        int low = 0;
        int high = height.length -1;
        int max = 0;
        while(low<=high)
        {
            int vol = Math.min(height[low],height[high])*(high-low);
            max = Math.max(max,vol);
            if(height[high]<height[low])
                high--;
            else 
                low++;
        }
        return max;
    }
}