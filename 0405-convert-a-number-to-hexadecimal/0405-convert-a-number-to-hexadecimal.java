class Solution {
    public String toHex(int num) 
    {
        if(num == 0)
            return "0";
        long val = num;
        String s = "";
        if(num<0)
        {
            val =(long)(Math.pow(2,32)+num);
        }  
        while(val != 0)
        {
            long rem = (val%16);
            
            if(rem>9)
            {
                s = (char)(rem+87)+s ;
            } 
            else
            {
                s=rem+s;
            }
            val /=16;
        }
        return s;
    }
}