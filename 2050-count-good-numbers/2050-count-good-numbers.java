class Solution {
    public int countGoodNumbers(long n) 
    {
        int MOD = (int)Math.pow(10,9)+7;
        long even = (n+1)/2;
        long odd = n/2;
        long evencount = power(5,even,MOD);
        long oddcount = power(4,odd,MOD);
        return (int)((evencount*oddcount)%MOD);
    }
    private static long power(long base, long exp, int mod) {
        long result = 1;   // for 9  ec 5 oc 4
        while (exp > 0) {
            if ((exp % 2) == 1) {   // 5  3125 256
                result = (result * base) % mod;
            }
            base = (base * base) % mod;//25  625   //16 256
            exp /= 2;              //2   1        //2
        }
        return result;
    }
}