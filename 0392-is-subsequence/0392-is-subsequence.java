class Solution {
    public boolean isSubsequence(String s, String t) {
        // Initialize a variable to keep track of the last matched position in t
        int lastIndex = -1;
        
        // Loop through each character in s
        for (int i = 0; i < s.length(); i++) {
            // Find the next occurrence of s.charAt(i) in t, starting from lastIndex + 1
            lastIndex = t.indexOf(s.charAt(i), lastIndex + 1);
            
            // If the character is not found, return false
            if (lastIndex == -1) {
                return false;
            }
        }
        
        // If all characters are found in order, return true
        return true;
    }
}
