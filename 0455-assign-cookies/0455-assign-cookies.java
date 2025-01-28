class Solution {
    public int findContentChildren(int[] g, int[] s) 
    {
        Arrays.sort(g);
        Arrays.sort(s);
        int n = s.length;
        int c = 0;
        int i=0;
        for(int j=0;i<g.length && j<n;j++)
        {
                if(s[j]>=g[i])
                {
                    c++;
                    i++;
                }
        }
        return i;
    }
}