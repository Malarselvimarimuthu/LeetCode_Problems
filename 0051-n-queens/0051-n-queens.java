class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>>ans=new ArrayList<>();
        nqueen(board,0,n,ans);
        return ans;
    }
    public void nqueen(char[][]board,int row,int n,List<List<String>>ans){
        if(row==n){
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                String str="";
                for(int j=0;j<n;j++){
                    str+=board[i][j];
                }
                temp.add(str);
            }
            ans.add(temp);
            return;
        }
        for(int j=0;j<n;j++){
            if(safe(board,row,j,n)){
                board[row][j]='Q';
                nqueen(board,row+1,n,ans);
                board[row][j]='.';
            }    
        }
    }
    public boolean safe(char[][]board,int row,int col,int n){
        //check up
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q')return false;
        }
        //check northwest
        int i=row;
        int j=col;
        while(i>=0&&j>=0){
            if(board[i][j]=='Q')return false;
            i--;
            j--;
        }
        //check northeast
        i=row;
        j=col;
        while(i>=0&&j<n){
            if(board[i][j]=='Q')return false;
            i--;
            j++;
        }
        return true;
    }
}