class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        backtrack(list,"",0,digits,digits.length(),map);
        return list;
    }
    static void backtrack(List<String> list,String str,int index,String digits,int max,HashMap<Character,String> map)
    {
        if(str.length()==max )
        {
            if(str.length()!=0)
            {
            list.add(str);
            }
            return;
        }
        char c = digits.charAt(index);
        String add = map.get(c);
      
        for(char ch:add.toCharArray())
        {
            backtrack(list,str+ch,index+1,digits,max,map);
        }
        
        return;
    }
}