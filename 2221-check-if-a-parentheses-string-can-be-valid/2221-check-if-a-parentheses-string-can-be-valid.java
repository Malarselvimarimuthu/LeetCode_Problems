class Solution {
    public boolean canBeValid(String s, String locked) 
    {
        if(s.length()%2 !=0)
        {
            return false;
        }
        int openCnt = 0;
        int closeCnt = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || locked.charAt(i)=='0')
            {
                openCnt++;
            }
            else{
                openCnt--;
            }
            if(openCnt<0)
            {
                return false;
            }
        }

        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==')' || locked.charAt(i)=='0')
            {
                closeCnt++;
            }
            else{
                closeCnt--;
            }
            if(closeCnt<0)
            {
                return false;
            }
        }
        return true;
    }
}