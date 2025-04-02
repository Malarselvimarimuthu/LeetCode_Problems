class Solution {
    public String frequencySort(String s) 
    {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        StringBuilder answer = new StringBuilder();
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(b) - map.get(a));
        for(char ch:list){
            for(int i=0;i<map.get(ch);i++){
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}