class Solution {

    private void getAns(int idx, int[] nums, long curr, long target, List<Object> li, List<String> ans, int opp, long part) {
        if (idx == nums.length) {
            if (target == curr) {
                StringBuilder x = new StringBuilder();
                for (var d : li) x.append(d);
                ans.add(x.toString());
            }
            return;
        }

        if (idx == 0) {
            long val = 0;
            for (int i = idx; i < nums.length; i++) {
                if (nums[idx] == 0 && i > idx) break;

                val = val * 10 + nums[i];
                li.add(val);
                getAns(i + 1, nums, curr + val, target, li, ans, 1, val);
                li.remove(li.size() - 1);
            }
        } else {
            long val = 0;
            for (int i = idx; i < nums.length; i++) {
                if (nums[idx] == 0 && i > idx) break;

                val = val * 10 + nums[i];

             
                li.add("+");
                li.add(val);
                getAns(i + 1, nums, curr + val, target, li, ans, 1, val);
                li.remove(li.size() - 1);
                li.remove(li.size() - 1);

               
                li.add("-");
                li.add(val);
                getAns(i + 1, nums, curr - val, target, li, ans, 0, val);
                li.remove(li.size() - 1);
                li.remove(li.size() - 1);

                
                li.add("*");
                li.add(val);
                long c = (opp == 1) ? (curr - part + part * val) : (curr + part - part * val);
                getAns(i + 1, nums, c, target, li, ans, opp, part * val);
                li.remove(li.size() - 1);
                li.remove(li.size() - 1);
            }
        }
    }

    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        List<Object> li = new ArrayList<>();

        int[] nums = new int[num.length()];
        for (int i = 0; i < nums.length; i++) nums[i] = num.charAt(i) - '0';

        getAns(0, nums, 0L, (long) target, li, ans, 1, 1L);
        return ans;
    }
}