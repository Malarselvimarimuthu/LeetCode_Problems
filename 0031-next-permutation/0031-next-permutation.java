class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int ind1 = -1;
        int ind2 = -1;

        // Step 1: Find the breakpoint
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind1 = i;
                break;
            }
        }

        if (ind1 == -1) {
            reverse(nums, 0, len - 1);  // ✅ Fix applied here
        } else {
            // Step 2: Find the number just larger than nums[ind1]
            for (int i = len - 1; i >= 0; i--) {
                if (nums[i] > nums[ind1]) {
                    ind2 = i;
                    break;
                }
            }

            // Step 3: Swap
            swap(nums, ind1, ind2);

            // Step 4: Reverse the suffix
            reverse(nums, ind1 + 1, len - 1);
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
