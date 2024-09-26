class Solution {
    public int longestPalindrome(String s) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        int c = 0;
        int flag = 0;
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()%2==0)
            {
                c +=entry.getValue();
            }
            else
            {
                c += entry.getValue()-1;
                flag = 1;
            }
        }
        return flag==0?c:c+1;
    }
}