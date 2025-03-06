class Solution {
    public boolean rotateString(String s, String goal) 
    {
        if(s.length() != goal.length()){
            return false;
        }
        String comb = s+s;
        return comb.contains(goal);
    }
}