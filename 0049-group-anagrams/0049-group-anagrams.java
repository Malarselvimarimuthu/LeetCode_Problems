class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String,List<String>> ag = new HashMap<>();

        for(String word : strs){

            char []ch = word.toCharArray();
            Arrays.sort(ch);
            String sw = new String(ch);
            ag.putIfAbsent( sw , new ArrayList<>());

            ag.get(sw).add(word);
        }

        return new ArrayList<>( ag.values() );
    }
}