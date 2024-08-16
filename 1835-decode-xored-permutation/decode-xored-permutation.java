class Solution {
    public int[] decode(int[] encoded) {
        int n=encoded.length+1;
        int f=0;
        for(int i=1;i<=n;i++)
        {
            f=f^i;
        } 
        for(int i=1;i<n-1;i=i+2)
        {
            f=f^encoded[i];
        }
        int [] ans=new int[n];
        ans[0]=f;
        for(int i=0;i<n-1;i++)
        {
            ans[i+1]=ans[i]^encoded[i];
        }
        return ans;
    }
}