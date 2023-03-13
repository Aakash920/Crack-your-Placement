class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        if(arr==null || arr.length==0) return ans;
        Arrays.sort(arr);
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                long mtar=(long)target-(long) arr[j]-(long) arr[i];
                int left=j+1, right=arr.length-1;
                
                while(left<right){
                    long sum=(long) arr[left]+(long) arr[right];
                    if(sum<mtar){
                        left++;
                    }else if(sum>mtar){
                        right--;
                    }else{
                        List<Integer> list=new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[left]);
                        list.add(arr[right]);
                        ans.add(list);
                        
                        while(left<right && arr[left]==list.get(2)) left++;
                        while(left<right && arr[right]==list.get(3)) right--;
                    }
                }
                while(j+1<arr.length && arr[j+1]==arr[j]) j++;
            }
            while(i+1<arr.length && arr[i+1]==arr[i]) i++;
        }
        return ans;
    }
}