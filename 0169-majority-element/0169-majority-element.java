class Solution {
    public int majorityElement(int[] nums) 
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i]) > nums.length/2)
            {
                return nums[i];
            }
        }
        return 0;
    }
}