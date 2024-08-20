class Solution {
    public int fib(int n) 
    {
        int i = 0;
        int j = 1;
        if(n>=2)
        {
            for(int x=2;x<n;x++)
            {
                int t = i;
                i = j;
                j = t + j;
            }
        }  
        if(n==0)
        {
            return 0;
        }
        return i+j;  
    }
}