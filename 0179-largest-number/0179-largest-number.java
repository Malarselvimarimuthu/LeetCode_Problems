class Solution {
    public String largestNumber(int[] nums) 
    {
      List<String> list = new ArrayList<>();
      for(int i=0;i<nums.length;i++)
      {
        list.add(String.valueOf(nums[i]));
      }   
      
      Collections.sort(list,(a,b)->(b+a).compareTo(a+b));
      if (list.get(0).equals("0")) {
            return "0";
        }
       
        StringBuilder result = new StringBuilder();
        for (String s : list) {
            result.append(s);
        }

        return result.toString();
    }
}