//{ Driver Code Starts
// Initial template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine();
            String S2 = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.areAnagram(S1, S2));
        }
    }
}
// } Driver Code Ends


// User function template for Java
class Solution {
    static int areAnagram(String s1, String s2) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0 ; i<s1.length() ; i++) {
            char c=s1.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(int i=0 ; i<s2.length() ; i++){
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }
        return check(map1,map2);
    }
    static int check(HashMap<Character,Integer> map1, HashMap<Character,Integer> map2){
        if(map1.size()!=map2.size()) return 0;
        
        for(Map.Entry<Character,Integer> e:map1.entrySet()){
            if(e.getValue()!=map2.getOrDefault(e.getKey(),0)){
                return 0;
            }
        }
        return 1;
    }
}