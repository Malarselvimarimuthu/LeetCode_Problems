class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        // value - index
        HashMap<Integer,Integer> map = new HashMap<>();
        int indices[] = new int[2];
        for(int ind=0;ind<numbers.length;ind++)
        {
            int val = target - numbers[ind];
            if(map.containsKey(val))
            {
                indices[0] = map.get(val);
                indices[1] = ind+1;
            }
            else{
                map.put(numbers[ind],ind+1);
            }
        }
        return indices;
    }
}