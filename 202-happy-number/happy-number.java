class Solution {
    public int result(int num)
    { int answer=0;
        while(num>0)
        { int res=num %10;
           answer=answer+(int)Math.pow(res,2);
           num=num/10;
        }
        return answer;
    }
    public boolean isHappy(int n)
    {
        int ans=0;
        if(n==1)
        {
            return true;
        }
        while(n!=1 && n>6)
        {
         n=result(n);
        }
        if(n==1){
            return true;
        }
        return false;
    }
}