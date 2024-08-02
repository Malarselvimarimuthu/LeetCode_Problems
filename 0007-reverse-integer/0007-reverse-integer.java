class Solution {
    public int reverse(int x) 
    {
        int t1 = x;
        int rev = 0;
        while(x!=0)
        {
            int t = x%10;
            if(rev>Integer.MAX_VALUE/10||rev<Integer.MIN_VALUE/10)
                return 0;
            rev = rev*10 + t;
            x = x/10;
        }
        return rev;
    }
}