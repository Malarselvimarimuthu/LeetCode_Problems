class Solution {
    public int nthUglyNumber(int n) 
    {
        int arr[] = new int[n];
        int pos1 = 0;
        int pos2 = 0;
        int pos3 = 0;
        arr[0] = 1;
        int min = 1;
        for(int i=1;i<n;i++)
        {
            min = Math.min(arr[pos1]*2,Math.min(arr[pos2]*3,arr[pos3]*5));
            if(min == arr[pos1]*2)pos1++;
            if(min == arr[pos2]*3)pos2++;
            if(min == arr[pos3]*5)pos3++;
            arr[i] = min;
        }   
        return arr[n-1];
    }
}