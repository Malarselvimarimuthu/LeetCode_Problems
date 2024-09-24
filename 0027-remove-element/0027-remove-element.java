class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int expectedNums[] = new int[nums.length];
        int i=0;
        for(int x:nums)
        {
            if(x!=val)
            {
                nums[i++]=x;
            }
        }
        return i;
    }
    
}