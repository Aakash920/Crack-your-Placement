//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			Solution T = new Solution();
			ArrayList<Integer> arr= T.mergeKArrays(a, n);
			for(int i = 0; i < n*n ; i++)
			    System.out.print(arr.get(i)+" ");
		    System.out.println();
		    
		    t--;
		}
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                ans.add(arr[i][j]);
            }
            
        }
        Collections.sort(ans);
        return ans;
        
    //     if(arr.length==0) return new ArrayList<>();
    //     ArrayList<Integer> list=mergeSort(arr,0,K-1);
    //     return list;
    // }
    // public static ArrayList<Integer> mergeSort(int[][] arr, int lo, int hi){
        
    //     int mid=lo+(hi-lo)/2;
    //     ArrayList<Integer> ls=mergeSort(arr,lo,mid);
    //     ArrayList<Integer> rs=mergeSort(arr,mid+1,hi);
    //     return merge(ls,rs);
    // }
    // public static ArrayList<Integer> merge(ArrayList<Integer> l1, ArrayList<Integer> l2){
    //     ArrayList<Integer> ans=new ArrayList<>();
    //     int i=0,j=0;
    //     while(i<l1.size() && j<l2.size()){
    //         if(l1.get(i)<=l2.get(j)){
    //             ans.add(l1.get(i));
    //             i++;
    //         }else{
    //             ans.get(l2.get(j));
    //             j++;
    //         }
    //     }
    //     while(i<l1.size()){
    //         ans.add(l1.get(i));
    //         i++;
    //     }
    //     while(j<l1.size()){
    //         ans.add(l1.get(i));
    //         j++;
    //     }
    //     return ans;
    }
}