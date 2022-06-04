class Solution {
    public String largestNumber(int[] arr) {
        String[] s=new String[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            s[i]=String.valueOf(arr[i]);
        }
        Arrays.sort(s, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        });
        if(s[0].equals("0")) return "0";
        StringBuilder sb=new StringBuilder();
        for(String str:s){
            sb.append(str);
        }
        return sb.toString();
    }       
}