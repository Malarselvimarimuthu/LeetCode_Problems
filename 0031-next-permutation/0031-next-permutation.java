class Solution {
    public void nextPermutation(int[] nums) {
        // Optimal logic 
        // STEP 1:FIND THE BREAK POINT FROM RIGHT TO LEFT 
        // EXMP: [2,1,5,4,3,0,0] BREAK POINT 1;
        // STEP2: SWAP 1 WITH NEXT HIGH ELEMENT IN RIGHT THAT IS 3 (1-3)
        // ARRAY LOOKS LIKE [2,3,5,4,1,0,0]
        // STEP 3: REVERSE THE RIGHT SIDE OF BREAK POINT IN ARRAY
        // [2,3,0,0,1,4,5] -> NEXT PERMUTATION

        // STEP 1
        int n = nums.length;
        int bp1 = -1;
        int bp2 = 0;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                bp1 = i-1;
                break;
            }
        }
        if(bp1!=-1){

        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[bp1]){
                bp2 = i;
                break;
            }
        }
        swap(bp1,bp2,nums);
        reverse(bp1+1,n-1,nums);
        }
        else{
            reverse(0,n-1,nums);
        }
    }
    public static void swap(int i,int j,int nums[])
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void reverse(int start,int end,int nums[])
    {
        while(start<=end){
            swap(start,end,nums);
            start++;
            end --;
        }
    }
}