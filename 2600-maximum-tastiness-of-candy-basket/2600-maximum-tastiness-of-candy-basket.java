class Solution {

    public int maximumTastiness(int[] price, int k) {
        int n = price.length;
        Arrays.sort(price);
        int s = 0;
        int e = Integer.MAX_VALUE;
        int ans=-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(isPossible(mid,price,k)){
                ans = mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }

        return ans;
    }

    public boolean isPossible(int mid, int[] price, int k){
        int lastPos = price[0];
        int count=1;

        for(int i=1;i<price.length;i++){
            if(price[i]-lastPos>=mid){
                count++;
                lastPos=price[i];

                if(count==k) return true;
            }
        }

        return false;
    }
}