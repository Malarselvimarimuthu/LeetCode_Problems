class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int indices[] = new int[2];
        while(left<right)
        {
            int sum = numbers[left]+numbers[right];
            if( sum == target)
            {
                indices[0] = left+1;
                indices[1] = right+1;
                // return;
                break;
            }
            else if(sum > target)
            {
                right--;
            }
            else{
                left ++;
            }
        }
        return indices;
    }
}