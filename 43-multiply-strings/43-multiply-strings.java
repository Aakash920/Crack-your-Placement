import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger i=new BigInteger(num1);
        BigInteger j=new BigInteger(num2);
        BigInteger ans=i.multiply(j);
        return ans.toString();
    }
}

