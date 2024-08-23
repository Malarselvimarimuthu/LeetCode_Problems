class Solution {
    public boolean isValid(String s) 
    {
        if(s.length()%2!=0)
            return false;
        Stack<Character> stack = new Stack();
        for(char x:s.toCharArray())
        {
            if(x=='(' || x=='[' || x=='{')
            {
                stack.push(x);
            }       
            else
            {
                if(stack.size()>0)
                {    
                    if(x==')'&& stack.peek()=='(')
                        stack.pop();
                    else if(x==']'&& stack.peek()=='[' )
                        stack.pop();
                    else if(x=='}'&& stack.peek()=='{')
                        stack.pop();
                    else
                        return false;    
                }
                else
                return false;
            }                
        }
        
        if(stack.size()==0)
                return true;
       
        return false;     
    }
}