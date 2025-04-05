class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) 
    {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[n];
        Set<List<Integer>> appeared = new HashSet<>();
        permut(nums,ans,ds,freq,appeared);
        
        return ans;
	}
	
	public static void permut(int arr[],List<List<Integer>> ans,List<Integer> ds,boolean freq[],Set<List<Integer>> appeared){
	    
        if(ds.size() == arr.length){
	        
            if(!appeared.contains(ds)){
                ans.add(new ArrayList<>(ds));
                appeared.add(new ArrayList<>(ds));
            }
            
	        return;
	    }
        
	    for(int i=0;i<arr.length;i++)
	    {
	        if(!freq[i]){
	            freq[i] = true;
	            ds.add(arr[i]);
                
	            permut(arr,ans,ds,freq,appeared);
	            ds.remove(ds.size() - 1);
	            freq[i] = false;
	        }
	    }
    }
}