class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int l = 0;
        int r = rows*cols -1;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            int i = mid/cols;
            int j = mid%cols;
            
            if(matrix[i][j]<target)
            {
                l = mid+1;
            }
            else if(matrix[i][j]>target)
            {
                r = mid-1;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}