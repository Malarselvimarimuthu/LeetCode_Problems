import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        if(s==null)
        {
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for(int i=0;i<s.length();i++) 
        {
           char ch = s.charAt(i);
           int count = map.getOrDefault(ch, 0);

            map.put(ch, count + 1);

                while( map.get(ch) >1)  
                {
                    char leftChar = s.charAt(left);
                    map.put(leftChar,map.get(leftChar)-1);
                    left++;
                }
            
            max = Math.max(i-left+1,max);
        }
        
        return max;
    }
}