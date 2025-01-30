class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int max = 0;
        for(int i=0;i<s.length();i++)
        {
            HashMap<Character,Integer> map = new HashMap<>();
            int count = 0;
            for(int j=i;j<s.length();j++)
            {
                // map.add(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                if(map.containsKey(s.charAt(j)))
                {
                    break;
                }
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                count++;
                max = Math.max(count,max);
            }
        }
        return max;
    }
}