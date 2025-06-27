class Solution {
    public String longestPalindrome(String s) {
        
        int n = s.length();
        int max = 0;
        int start = 0;
        int end = 0;
        for(int i=0;i<n;i++)
        {
            int len1 = helper(i,i,s);
            int len2 = helper(i,i+1,s);
            int len = Math.max(len1,len2);
            if(len> end-start)
            {
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        
        return s.substring(start,end+1);
    }

    public static int helper(int start,int end,String s)
    {
        int n = s.length();
         while(start>=0 && end <n && s.charAt(start) == s.charAt(end))
            {
                start --;
                end ++;
            }
        return end-start-1;    
    }
}