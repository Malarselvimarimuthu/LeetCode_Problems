import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set <Integer> set1 = new HashSet<>();
        Set <Integer> set2 = new HashSet<>();
        
        for(int x:nums1)
        {
            set1.add(x);
        }
        for(int x:nums2)
        {
            set2.add(x);
        }
        set1.retainAll(set2);
        int res[] = new int[set1.size()];
        int i = 0;
        for(int x:set1)
        {
            res[i++] = x;
        }
        return res;
    }
}