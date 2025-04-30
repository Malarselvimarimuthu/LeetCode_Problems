class Solution {
    // Greedy Algorithm
    public int findContentChildren(int[] g, int[] s) 
    {
        Arrays.sort(g);
        Arrays.sort(s);

        int count =0;
        int greedIndex = 0;
        for(int i=0;i<s.length && greedIndex<g.length;i++){
            if(s[i]>=g[greedIndex]){
                greedIndex ++;
            }
        }
        return greedIndex;
    } 
}