class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int arr[] = new int[nums1.length]; 
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    for(int k=j;k<nums2.length;k++)
                    {
                        arr[i] = -1;
                        if(nums2[k]>nums1[i])
                        {
                            arr[i] = nums2[k];
                            break;
                        }
                    }
                }
            }

        }
        return arr;
    }
}