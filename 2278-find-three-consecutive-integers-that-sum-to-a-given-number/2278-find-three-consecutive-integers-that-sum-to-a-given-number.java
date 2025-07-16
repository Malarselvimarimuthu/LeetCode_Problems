class Solution {
    public long[] sumOfThree(long num) {
        // long[] l= new long[1];
        long i = num/3;
        if(3*i == num)
        {
            return new long[]{i-1,i,i+1};
        }
        return new long[0];
    }
}