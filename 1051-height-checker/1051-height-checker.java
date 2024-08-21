class Solution {
    public int heightChecker(int[] heights) 
    {
        int cnt = 0;
        int n = heights.length;
        int hArr[] = Arrays.copyOf(heights,n);
        Arrays.sort(hArr);
        for(int i=0;i<n;i++)
        {
            if(hArr[i]!=heights[i])
                cnt++;
        }
        return cnt;
    }
}