class Solution {
    public void sortColors(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int k = 0;
        int n = map.size();
        for(int i=0;i<=n;i++)
        {
            if(map.containsKey(i))
            {
            int a = map.get(i);
            for(int j=1;j<=a;j++)
            {
                nums[k]  = i;
                k++;
            }
            }
        }
    }
}