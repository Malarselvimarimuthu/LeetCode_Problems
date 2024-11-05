class Solution {
    public static void dfs(int node,ArrayList<ArrayList<Integer>> adj,int[] vis)
    {
        vis[node] = 1;
        for(int a:adj.get(node))
        {
            if(vis[a]!=1)
            {
                dfs(a,adj,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        // convert to Adjacency List
        // dfs algorithm
        // visi array
        // vis?==0
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int m = isConnected.length;
        int n = isConnected[0].length;
        int vis[] = new int[m];
        for(int i=0;i<m;i++)
        {
           adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i); 
                }
            }
        }
        int c = 0 ;
        for(int i=0;i<m;i++)
        {
            if(vis[i]==0) // check for not visited nodes 
            {
                c++;
                dfs(i,adj,vis);
            }
        }
        return c;
    }
}
