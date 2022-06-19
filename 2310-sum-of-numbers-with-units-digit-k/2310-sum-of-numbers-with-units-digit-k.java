class Solution {
    public int minimumNumbers(int num, int k) {
        // if(num<=0) return 0;
        // if(num==k) return 1;
        // if(k==1) return num;
        // if(k==0) return -1;
        // int count=0;
        // while(num>0){
        //     num-=k;
        //     if(num%10==k){
        //         count++;
        //     }
        // }
        // if(count==0){
        //     return -1;
        // }
        // return count+1;
        if(num==0) return 0;
        for(int i=1 ; i*k<=num && i<=10 ; i++){
            if(num%10==((i*k)%10)){
                return i;
            }
        }
        return -1;
    }
}