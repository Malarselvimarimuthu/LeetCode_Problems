class Solution {
    public String sort(String s){
        char str[] = s.toCharArray();
        Arrays.sort(str);
        return new String(str);
    }
    public boolean checkInclusion(String s1, String s2) 
    {
        int n = s1.length();
        int m = s2.length();
        if(n>m) return false;
        String s1new = sort(s1);
        for(int i=0;i<=m-n;i++)
        {
            String s2new = sort(s2.substring(i,i+n));
            if(s2new.equals(s1new)){
                return true;
            }
        }
        return false;
    }
}