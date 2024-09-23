class Solution {
    public int addDigits(int num) 
    {
        return digit(num);
    }
    public int digit(int n)
    {
        int s = 0;
        int ts = 0;
        int cnt = 0;
        while(n>0)
        {
            int r = n%10;
            cnt++;
            
            s +=r;
            n/=10;
        }
        // System.out.println(cnt);
        if(cnt >1)
        {
            ts += digit(s);
            return ts;
            // System.out.println(ts);
        }
        return s;
    }
}