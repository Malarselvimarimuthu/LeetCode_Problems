class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        int len1 = nums1.length;
        int len2 = nums2.length;
        // int x = 0;
        ArrayList<Integer> list = new ArrayList<>();
        if(len1<=len2)
        {
            for(int i=0;i<len1;i++)
            {
                for(int j=0;j<len2;j++)
                {
                    if(nums1[i]==nums2[j])
                    {
                        nums2[j]=-1;
                        list.add(nums1[i]);
                        break;
                    }
                }
            }
        }
        else
        {
            for(int i=0;i<len2;i++)
            {
                for(int j=0;j<len1;j++)
                {
                    if(nums2[i]==nums1[j])
                    {
                        nums1[j]=-1;
                        list.add(nums2[i]);
                        break;
                    }
                }
            }
        }
        int res[] = new int[list.size()];
        int i = 0;
        for(int x:list)
        {
            res[i++] = x;
        }
        return res;
    }
}