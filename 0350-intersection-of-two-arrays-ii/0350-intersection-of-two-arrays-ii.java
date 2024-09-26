class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<len1 && j<len2)
        {
            if(i<len1 && nums1[i]<nums2[j]) i++;
            else if(j<len2 && nums1[i]>nums2[j]) j++;
            else if(nums1[i]==nums2[j])
            { 
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int res[] = new int[list.size()];
        int k=0;
        for(int x:list)
        {
            res[k++] = x;
        }
        return res;
    }
}
// i=0 j=0 r =1
// i=1 j=0 r=2
// i=2 j=1 r=3
// i=3 j=2 r=4