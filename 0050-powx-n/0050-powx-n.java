class Solution {
    public double pow(double x,long n){
        if(n==0) return 1; //base case
        if(n<0) return pow(1/x,-n); //negative case
        if(n%2==0) return pow(x*x,n/2); //even case
        else return x*pow(x*x,(n-1)/2); //odd case
    }
    public double myPow(double x, int n) {
        return pow(x,(long)n); //explictly converting to long value
    }
}