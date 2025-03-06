class Solution {
    public boolean rotateString(String s, String goal) 
    {
        for(int i=0;i<s.length();i++){
            if(goal.equals(rotate(s))){
                return true;
            }
            s=rotate(s);
        }
        return false;
    }
    public String rotate(String s){
        char firstChar = s.charAt(0);
        return s.substring(1)+firstChar ;
    }
}