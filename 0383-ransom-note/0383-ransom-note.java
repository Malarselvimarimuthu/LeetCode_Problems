class Solution {
    public boolean canConstruct(String r, String m) 
    {
        int a[]=new int[26];
        for(int i=0;i<r.length();i++)
        {
            a[r.charAt(i)-'a']++;
        }
         for(int i=0;i<m.length();i++)
        {
            a[m.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]>0)
            return false;
        }
        return true;

    }
}