class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        
        if(dividend==Integer.MAX_VALUE && divisor==-1) return Integer.MIN_VALUE;
        
        int ans=dividend/divisor;
        return ans;
    }
        
//         boolean negative = dividend < 0 ^ divisor < 0;

//         dividend = find(dividend);
//         divisor = find(divisor);

//         while (dividend <= divisor) {
//             dividend -= divisor;
//             count++;
//         }

//         return negative ? -count : count;
//     }
//     private int find(int a){
//          return (a<0) ? a : -a;
//     }
        
//         if (dividend == Integer.MIN_VALUE && divisor == -1)
//             return Integer.MAX_VALUE;

//         boolean negative = dividend < 0 ^ divisor < 0;
//         int ans = 0;

//         dividend = reverseAbs(dividend);
//         divisor = reverseAbs(divisor);

//         while (dividend <= divisor) {
//             dividend -= divisor;
//             ans++;
//         }

//         return negative ? -ans : ans;
//     }

//     private static int reverseAbs(int a)
//     {
//         return (a < 0) ? a : -a;
//     }
}