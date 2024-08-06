class Solution {
    public int fib(int n) {
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public int fibonacci(int num){
        int n=0;
        if(num==0||num==1){return num;}
        else{
           n=fibonacci(num-1)+fibonacci(num-2);
        }
        return n;
    }
}