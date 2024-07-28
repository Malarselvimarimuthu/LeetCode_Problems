class Solution {
    public int trap(int[] height) {
        int len = height.length;
		int prefix[] = new int[len];
		int suffix[] = new int[len];
		int prefi = 0;
		int suffi = 0;
        int sum = 0;
		for(int i=0;i<len;i++)
		{
		    prefi = Math.max(prefi,height[i]);
		    prefix[i] = prefi;
		    
		}
		for(int i=len-1;i>=0;i--)
		{
		    suffi = Math.max(suffi,height[i]);
		    suffix[i] = suffi;
		}
		for(int i=0;i<len;i++)
		{
		    sum += Math.min(prefix[i],suffix[i])-height[i];
		}
        return sum;
    }
}