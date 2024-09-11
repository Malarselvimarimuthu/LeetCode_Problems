class Solution {
    public boolean predictTheWinner(int[] nums) 
    {
       if(predict(nums,0,nums.length-1)>=0)
       {
        return true;
       }
       return false;
    }
    public int predict(int[]nums,int left,int right)
    {
       if(left==right)
        return nums[left];
       int p1 =nums[left]- predict(nums,left+1,right); 
       int p2 = nums[right]-predict(nums,left,right-1);
       return Math.max(p1,p2); 
    }   
}