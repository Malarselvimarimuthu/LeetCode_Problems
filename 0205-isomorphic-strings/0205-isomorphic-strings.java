class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        int len1 =s.length();
        HashMap<Character , Character> map = new HashMap <Character,Character>();
        for(int i=0;i<len1;i++)
        {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(!map.containsKey(c1))
            {
	                if(!map.containsValue(c2)) 
                    {
	                    map.put(c1,c2);
	                } 
                    else
                    {
	                    return false;
	                }
	        } 
            else 
            {
	            if(map.get(c1) != c2) 
                {
	                    return false;
	            }
	        }        
        }
        return true;
    }
    
}