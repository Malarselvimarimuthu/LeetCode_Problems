class Pair
{
    int row;
    int col;
    Pair(int _row,int _col)
    {
        this.row = _row;
        this.col = _col;
    }
}
class Solution {
    public int numEnclaves(int[][] grid) 
    {
        int m = grid.length;
        int n = grid[0].length;
        int [][]vis = new int[m][n];
       
        // rows: 1st and last
        Queue<Pair> q = new   LinkedList<>();
        for(int col=0;col<n;col++)
        {
             if(grid[0][col] == 1)
             {
                q.add(new Pair(0,col));
                vis[0][col] = 1;
             }
             if(grid[m-1][col]==1)
             {
                q.add(new Pair(m-1,col));
                vis[m-1][col] = 1;
             }
        }
        //cols: 1st and Last
        for(int row=0;row<m;row++)
        {
            if(grid[row][0]==1)
            {
                q.add(new Pair(row,0));
                vis[row][0] = 1;
            }
            if(grid[row][n-1]==1)
            {
                q.add(new Pair(row,n-1));
                vis[row][n-1] = 1;
            }
        }
        //left right up down
        int drow[] = {0,0,1,-1};
        int dcol[] = {-1,1,0,0};
        while(!q.isEmpty())
        {
            int r = q.peek().row;
            int c = q.peek().col;
            q.poll();
            for(int i=0;i<4;i++)
            {
                int nrow = r+drow[i];
                int ncol = c+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]==1 && vis[nrow][ncol]==0)
                {
                    q.offer(new Pair(nrow,ncol));
                    vis[nrow][ncol] = 1;
                }
            }
        }    
            int ans  = 0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(grid[i][j]==1 && vis[i][j]==0)
                    {
                        ans++;
                    }
                }
            }
            
        
        return ans ;
    }
}