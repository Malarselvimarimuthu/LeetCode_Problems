class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') i++;
        boolean sign = true;
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i++) == '+');
        } 
        int num = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {
            int old = num;
            num *= 10; num += s.charAt(i) - '0';
            int now = num;
            if (now / 10 != old) return (sign)? Integer.MAX_VALUE : Integer.MIN_VALUE; 
            i++;

        }
        return (sign)? num: -num;
    
    
    }
}