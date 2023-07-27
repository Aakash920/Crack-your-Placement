class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
//         boolean left=false, right=false;
//         int i=0;
//         boolean ans=false;
//         while(i<arr.length-1 && n!=0){
//             if(arr[i]==1) {
//                 left=true;
//             }
//             else if(arr[i+1]==1) right=true;
            
//             if(i<arr.length+1 && arr[i]==1) i+=2;
//         }
        
        // int i=1;
        // if(arr.length==1 && n!=0 && arr[0]==0){
        //     arr[0]=1;
        //     n--;
        // }
        // if(i<arr.length && arr[0]==0 && arr[1]==0){
        //     arr[0]=1;
        //     n--;
        // }
        // if(i<arr.length-1 && arr[arr.length-1]==0 && arr[arr.length-2]==0){
        //     arr[arr.length-1]=1;
        //     n--;
        // }
        // if(n==0) return true;
        // while(i<arr.length-1 && n!=0){
        //     if(arr[i]==0){
        //         if(arr[i-1]==0 && arr[i+1]==0){
        //             n--;
        //             arr[i]=1;
        //             if(n==0) return true;
        //             if(i<arr.length-2) i+=2;
        //         }else{
        //             if(i<arr.length-1) i+=1;
        //         }
        //     }else{
        //         if(i<arr.length-2) i+=2;
        //     }
        // }
        // return false;
        
        if(n==0) return true;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==0 && (i==0 || arr[i-1]==0) && (i==arr.length-1 || arr[i+1]==0) ){
                n--;
                if(n==0) return true;
                arr[i]=1;
            } 
        }
        return false;
    }
}