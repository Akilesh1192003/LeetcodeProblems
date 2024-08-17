class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int max=0,profit=0,min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++) 
    {
        min=Math.min(min,prices[i]);
        profit=prices[i]-min;
        max=Math.max(profit,max);
    }
    return max;
    }
}