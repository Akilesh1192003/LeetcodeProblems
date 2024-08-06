class Solution {
    public int fib(int n) {
        if(n==0||n==1){return n;}
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public int fibonacci(int num){
        int n=0;
        if(num==0||num==1){return num;}
           return fibonacci(num-1)+fibonacci(num-2);
    }
}