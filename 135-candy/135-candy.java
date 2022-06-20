class Solution {
    public int candy(int[] arr) {
        int[] left=new int[arr.length];
		Arrays.fill(left,1);
		for(int i=1 ; i<arr.length ; i++){
			if(arr[i]>arr[i-1]){
				left[i]=left[i-1]+1;
			}
		}
		int right=1;
		for(int j=arr.length-2 ; j>=0 ; j--){
			if(arr[j]>arr[j+1]){
				right++;
				left[j]=Math.max(left[j],right);
			}else{
				right=1;
			}
		}
		int sum=0;
		for(int i=0 ; i<left.length ; i++){
			sum+=left[i];
		}
		return sum;
    }
}