class Solution {
    public boolean isPalindrome(int x) {
        int c=0,d=0,temp=x;
        while(temp!=0){
           c=temp%10;
           temp=temp/10;
           d=d*10+c;
        }
        if(d==x &&x>=0){
            return true;
        }
        else{
            return false;
        }
    }
}