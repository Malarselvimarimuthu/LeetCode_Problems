class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s+s;
        String sub = doubled.substring(1,doubled.length()-1);
        return sub.contains(s);
    }
}
// bababa //abab -> contains
//aba //baab -> not contains
// abcabc //bcabcabcab -> contains
// abaab -> baababaa -> not contains
// abaa -> baaaba -> not contains
// abab -> bababa -> not contains
