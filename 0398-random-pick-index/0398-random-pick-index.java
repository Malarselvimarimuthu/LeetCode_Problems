import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class Solution {

    private Map<Integer, List<Integer>> indexMap;
    private Random random;

    // Constructor to initialize index map and random object
    public Solution(int[] nums) {
        indexMap = new HashMap<>();
        random = new Random();

        // Build a map of indices for each number
        for (int i = 0; i < nums.length; i++) {
            indexMap.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
    }

    // Method to randomly pick an index of the target
    public int pick(int target) {
        List<Integer> indices = indexMap.get(target);
        return indices.get(random.nextInt(indices.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
