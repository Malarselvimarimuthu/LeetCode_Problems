class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        backtrack(list,target,li,0,0,candidates);
        return list;
    }
    static void backtrack(List<List<Integer>> list,int target,List<Integer> li,int sum,int ind,int[] candidates)
    {
        if(sum == target)
        {
            list.add(new ArrayList<>(li));
            return;
        }
        if(sum>target || ind >= candidates.length)
        {
            return;
        }
        int add = candidates[ind];
        li.add(add);
        backtrack(list,target,li,sum+add,ind,candidates);
        li.remove(li.size()-1);
        backtrack(list,target,li,sum,ind+1,candidates);
        return;
    }
}