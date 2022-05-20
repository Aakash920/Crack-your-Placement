class Solution {
    public List<Integer> majorityElement(int[] arr) {
         ArrayList<Integer> ans=new ArrayList<>();
        int count1=1;
        int ele1=arr[0];
        int count2=0;
        int ele2=0;

        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]==ele1){
                count1++;
            }else if(arr[i]==ele2){
                count2++;
                ele2=arr[i];
            }else if(count1==0){
                ele1=arr[i];
                count1++;
            }else if(count2==0){
                ele2=arr[i];
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0; count2=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==ele1){
                count1++;
            }else if(arr[i]==ele2){
                count2++;
            }
        }
        if(count1>arr.length/3){
            ans.add(ele1);
        }
        if(count2>arr.length/3){
            ans.add(ele2);
        }
        return ans;
    }
}