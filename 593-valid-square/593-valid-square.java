class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        double[] arr=new double[6];
        arr[0]=getSide(p1,p2);
        arr[1]=getSide(p1,p3);
        arr[2]=getSide(p1,p4);
        arr[3]=getSide(p2,p3);
        arr[4]=getSide(p2,p4);
        arr[5]=getSide(p3,p4);
        
        Arrays.sort(arr);
        if(arr[5]==0)  //if diagonale is zero
            return false;
        boolean isSame=arr[0]==arr[1] && arr[0]==arr[2] && arr[0]==arr[3];
        boolean diagonal=arr[4]==arr[5];
        
        return isSame && diagonal;
    }
    public double getSide(int[] p1,int[] p2){
        return Math.pow((Math.pow((p1[0]-p2[0]),2)+Math.pow((p1[1]-p2[1]),2)),2);
    }
}