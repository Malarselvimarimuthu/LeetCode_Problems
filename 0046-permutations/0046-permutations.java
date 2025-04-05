class Solution {
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean [nums.length];
        req(nums,ans,ds,freq);
        return ans;
    }
    public void req(int []nums,List<List<Integer>> ans,List<Integer> ds,boolean freq[])
    {
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                req(nums,ans,ds,freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}