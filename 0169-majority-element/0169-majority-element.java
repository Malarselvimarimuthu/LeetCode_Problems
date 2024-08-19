class Solution {
    public int majorityElement(int[] nums) 
    {
        int cnt = 1;
        int majority = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(cnt == 0)
            {
                cnt = 1;
                majority = nums[i];
            }
            else if(majority == nums[i])
            {
                cnt++;
            }
            else
            {
                cnt --;
            }
        }
        return majority;
    }
}