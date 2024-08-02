class Solution {
    public int climbStairs(int n) {
        int i=0,j=1;
        for(int len=0;len<n;len++)
        {
            int t=i+j;
            i = j;
            j = t;
        }
        return j;
    }
}