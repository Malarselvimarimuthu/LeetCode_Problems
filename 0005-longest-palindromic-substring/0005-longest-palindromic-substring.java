class Solution {
    public String longestPalindrome(String s) {
        
        int max = 0;
        String maxStr = "";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+max;j<=s.length();j++)
            {
                if(i<j && isPalindrome(i,j,s))
                {
                    max = Math.max(max,j-i+1);
                    maxStr = s.substring(i,j);
                }
            }
        }
        return maxStr;
    }
    static boolean isPalindrome(int start,int end,String s)
    {
        end = end - 1;
        while(start <= end)
        {
            if(s.charAt(start) == s.charAt(end))
            {
                start++;
                end--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}