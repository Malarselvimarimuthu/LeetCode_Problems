class Solution {
    public boolean backspaceCompare(String s, String t) {
        return compare(s).equals(compare(t));
    }
    public String compare(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#')
            {
                if(!stack.isEmpty())
                {
                stack.pop();
                }
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        return String.valueOf(stack);
    }
}