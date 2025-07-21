class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        for(int right=0;right<s.length();right++)
        {
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1)
            {
                char leftChar = s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}