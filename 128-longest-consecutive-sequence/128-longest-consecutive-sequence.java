class Solution {
    public int longestConsecutive(int[] arr) {
        // HashMap<Integer,Boolean> map=new HashMap<>();
        // for(int x:arr){
        //     map.put(x,true);
        // }
        // for(int x:arr){
        //     if(map.containsKey(x-1)){
        //         map.put(x,false);
        //     }
        // }
        // int ml=0;
        // int msp=0;
        // for(int x:arr){
        //     if(map.get(x)==true){
        //         int tl=1;
        //         int tsp=x;
        //         while(map.containsKey(tsp+tl)){
        //             tl++;
        //         }
        //         if(tl>ml){
        //             ml=tl;
        //             msp=tsp;
        //         }
        //     }
        // }
        // return ml;
        if(arr.length==0) return 0;
        Arrays.sort(arr);
        int count=0 ;
        int mcount=0;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]-arr[i-1]>1){
                count=0;
            }else if(arr[i]-arr[i-1]==1){
                count++;
            }
            mcount=Math.max(mcount,count);
        }
        
        return mcount+1;
    }
}