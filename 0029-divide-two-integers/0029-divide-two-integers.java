class Solution {
    public int divide(int dividend, int divisor) {
        int b = dividend/divisor;
         if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if(divisor<0 && dividend <0 &&b<0){
           b=-1*b;
        }
        return b;
    }
}