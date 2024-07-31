class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap <Integer,Integer> map = new HashMap<>();
        int indices[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int val = target - nums[i];
            if(map.containsKey(val))
            {
                indices[0] = map.get(val);
                indices[1] = i;
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return indices;
    }
}