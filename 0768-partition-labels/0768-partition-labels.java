class Solution {
    public List<Integer> partitionLabels(String s) {
        
        Map<Character, Integer> last = new HashMap<>();

        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<s.length();i++)
        {
            last.put(s.charAt(i),i);
        }
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++)
        {
            end = Math.max(end,last.get(s.charAt(i)));
            if(i==end){
                list.add(end-start+1);
                start = i+1;
            }
        }
        return list;
    }
}