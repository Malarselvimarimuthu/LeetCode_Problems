class Solution {
    public boolean backspaceCompare(String s, String t) {
        s = compare(s);
        t = compare(t);
        System.out.println(s);
        System.out.println(t);
        return s.equals(t);
    }
    public String compare(String s)
    {
        Stack<Character> stack = new Stack<>();
        String str="";
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
        while(!stack.isEmpty()) {
            str +=stack.pop();
        }
        return str;
    }
}