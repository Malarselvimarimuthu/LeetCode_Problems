class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        HashMap <Character,String> map = new HashMap<>();
        int len1 = pattern.length();
        
        String []str = s.split("\\s+");
        int len2 = str.length;
        if(len1 != len2)
        {
            return false;
        } 
        for(int i=0;i<len1;i++)
        {
            if(map.containsKey(pattern.charAt(i)))
            {
                if(!map.get(pattern.charAt(i)).equals(str[i]))
                {
                    return false;
                }
            }
            else
            {
                if(map.containsValue(str[i]))
                    return false;
            map.put(pattern.charAt(i),str[i]);
            }
        }
        return true;
    }
}