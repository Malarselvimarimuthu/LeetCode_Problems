class Solution {
    public int findJudge(int n, int[][] trust) 
    {
        int len = trust.length;
        int inD[] = new int[n+1];
        int outD[] = new int[n+1];
        int ans = -1;
        for(int i=0;i<len;i++)
        {
            outD[trust[i][0]] ++;
            inD[trust[i][1]] ++;
        }
        for(int i=1;i<n+1;i++)
        {
            if(inD[i]==n-1 && outD[i]==0)
            {
                ans = i;
            }
        }
        return ans;
    }
}