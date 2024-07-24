class Solution {
    public String removeOuterParentheses(String s) 
    {
        String res = "";
        int open = 0 , close = 0 , start = 0;
        for(int i=0 ; i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                open ++;
            }
            if(s.charAt(i) == ')')
            {
                close ++;
            }
            if(open == close)
            {
                res += s.substring(start+1 , i );
                start = i+1;
                open = 0;
                close = 0;
            }
        }
        return res;
    }
}