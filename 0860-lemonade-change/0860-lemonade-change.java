class Solution {
    public boolean lemonadeChange(int[] arr) {
        if(arr[0]!=5) return false;
        int i=0;
        int count5=0;
        int count10=0;
        int count20=0;
        while(i<arr.length){
            if(arr[i]==5) {
                i++;
                count5++;
            }
            else if(arr[i]==10){
                if(count5>0){
                    count10++;
                    count5--;
                    i++;
                }else{
                    return false;
                }
            }else{
                if(count10>0 && count5>0){
                    count20++;
                    count10--;
                    count5--;
                    i++;
                }else if(count5>=3){
                    count20++;
                    count5-=3;
                    i++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}