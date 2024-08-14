class Solution {
    public int findTheWinner(int n, int k) {
        int w=0;
        for(int i=1;i<=n;i++)
        {
            w=(w+k)%i;
        }
        return w+1;
    }
}