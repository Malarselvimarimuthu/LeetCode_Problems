class Solution {
    public int myAtoi(String s) {
        int x = 0;
        int i=0;
        int len = s.length();
        while(i<len && s.charAt(i)==' ') i++;
        boolean sign = true;
        if(i<len && (s.charAt(i) == '-' || s.charAt(i) == '+'))
        {
           sign = (s.charAt(i) == '+'); 
           i++;
        }
        long num = 0;
        while(i<len && Character.isDigit(s.charAt(i)))
        {
            num *= 10;
            num  += s.charAt(i) - '0';
            i++;
          
            if(!sign && (-num) <Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign && num > Integer.MAX_VALUE ) return Integer.MAX_VALUE;
        }

        return (int)((sign)? num : -num);
    }
}