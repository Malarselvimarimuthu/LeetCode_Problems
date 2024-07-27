class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        int len1 =s.length();
        HashMap<Character , Character> map1 = new HashMap <Character,Character>();
        for(int i=0;i<len1;i++)
        {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map1.containsKey(c1))
            {
                if(map1.get(c1)!=c2)
                {
                    return false;
                }
            }
            else 
            {
                if(map1.containsValue(c2))
                {
                    return false;
                }    
                map1.put(c1,c2);
            }
            
        }
        return true;
    }
    
}