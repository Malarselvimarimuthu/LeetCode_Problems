class Solution {
    public String[] findRelativeRanks(int[] score) {
        ArrayList<Integer> al = new ArrayList<>();
        String[] res = new String[score.length];
        for(int ele :score)
        al.add(ele);
        Collections.sort(al);
        HashMap<Integer,Integer> hm = new HashMap<>();
        int r=0;
        for(int i = al.size()-1;i>=0;i--)
        {
            hm.put(al.get(i),r);
            r++;
        }
        for(int i =0;i<score.length;i++)
        {
            int rank = hm.get(score[i]);
            if(rank==0)
            res[i]="Gold Medal";
            else if(rank==1)
            res[i]="Silver Medal";
            else if(rank==2)
            res[i]="Bronze Medal";
            else
            res[i]=String.valueOf(rank+1);
        }
        return res;
    }
}