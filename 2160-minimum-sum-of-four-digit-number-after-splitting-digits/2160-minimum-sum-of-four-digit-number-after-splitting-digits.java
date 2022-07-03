class Solution {
    public int minimumSum(int num) {
//         int[] arr=new int[4];
//         int i=0;
//         while(num!=0){
//             arr[i]=num%10;
//             num/=10;
//             i++;
//         }
//         Arrays.sort(arr);
//         if(arr[0]==0 && arr[1]==0 && arr[2]==0) return arr[3];
//         else if(arr[0]==0 && arr[1]==0) return arr[2]+arr[3];
//         else if(arr[0]==0) return arr[1]*10 + arr[2]+arr[3];
        
//         return arr[0]*10 +arr[3] + arr[1]*10 + arr[2];
        
        //Another solution with same Approach
        int[] arr=new int[4];
        int i=0;
        while(num!=0){
            arr[i]=num%10;
            num/=10;
            i++;
        }
        Arrays.sort(arr);
        int a=arr[0]*10+arr[2];
        int b=arr[1]*10+arr[3];
        
        return a+b;
    }
}