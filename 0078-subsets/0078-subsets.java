class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<List<Integer>> ans = new ArrayList<>();
        fun(0,nums.length ,nums,list,ans);
        return ans;
    }
    public static void fun(int ind,int n,int[] arr,ArrayList<Integer> list,List<List<Integer>> ans)
    {
        if(ind == n)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[ind]);
        fun(ind+1,n,arr,list,ans);
        list.remove(list.size() - 1);
        fun(ind+1,n,arr,list,ans);
    }
}