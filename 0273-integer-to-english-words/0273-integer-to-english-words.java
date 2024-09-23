class Solution {
    String ones[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    String tens[] = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    String thousands[]= {"","Thousand","Million","Billion"};
    public String numberToWords(int n) 
    { 
        int i = 0;
        String words = new String();
        if(n==0) return "Zero";
        while(n>0)
        {
            if(n%1000!=0)
            {
                words = helper(n%1000)+thousands[i]+" "+words;
            }
            i++;
            n/=1000;
        }
        return words.trim();
    }
    public String helper(int n)
    {
        if(n==0) return "";
        else if(n<20) return ones[n]+" ";
        else if(n<100) return tens[n/10] + " "+helper(n%10);
        else return helper(n/100)+"Hundred "+helper(n%100);
    }
}