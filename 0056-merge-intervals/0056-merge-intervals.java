class Solution {
    public int[][] merge(int[][] intervals) 
    {
        int row = intervals.length;
        int col = intervals[0].length;

        List <int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        int []prev = intervals[0];
        for(int i=1;i<row;i++)
        {
            int []interval = intervals[i];
            if(prev[1]>=interval[0])
            {
                prev[1] = Math.max(interval[1],prev[1]);
            }
            else
            {
                list.add(prev);
                prev = interval;
            }
        }
        list.add(prev);
        return list.toArray(new int[list.size()][]);
    }
}