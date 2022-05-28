class Solution {
    public int largestRectangleArea(int[] height) {
        int n=height.length;
        Stack<Integer> s=new Stack<>();
        int[] leftmin=new int[n];
        int[] rightmin=new int[n];
        
        for(int i=0 ; i<height.length ; i++){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()) leftmin[i]=0;
            else leftmin[i]=s.peek() + 1;
            s.push(i);
        }
        while(!s.isEmpty()) s.pop();
        
        for(int i=n-1 ; i>=0 ; i--){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()) rightmin[i]=n-1;
            else rightmin[i]=s.peek() - 1;
            s.push(i);
        }
        int maxArea=0;
        for(int i=0 ; i<n ; i++){
            maxArea=Math.max(maxArea, height[i]*(rightmin[i]-leftmin[i]+1));
        }
        return maxArea;
    }
}