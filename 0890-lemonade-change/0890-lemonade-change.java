class Solution {
    public boolean lemonadeChange(int[] bills) {

        int n = bills.length;
        int cnt5 = 0;
        int cnt10 = 0;
        int cnt20 = 0;
        for(int i=0;i<n;i++){
            if(bills[i] == 5){
                cnt5 ++;
            }

            if(bills[i]==10 ){
                if(cnt5 >= 1)
                {
                cnt10 ++;
                cnt5 --;
                }
                else{
                    return false;
                }
            }

            else if(bills[i]==20){
                if(cnt10>=1 && cnt5>=1){
                    cnt10 --;
                    cnt5--;
                    cnt20++;
                }
                else if(cnt5>=3){
                    cnt5 = cnt5 - 3;
                    cnt20 ++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}