class Solution 
{
    public int trap(int[] height) 
    {
        int size = height.length;
        int[] left = new int[size];
        int[] right = new int[size];
        left[0] = height[0];
        right[size-1] = height[size-1];
        for(int ind = 1 ; ind < size ; ind++)
        {
            left[ind] = Math.max(left[ind-1] , height[ind]);
            right[size-1-ind] = Math.max(right[size - ind] , height[size-1-ind]);
        }
int sum = 0;
        for(int ind = 0 ; ind < size ; ind++)
        {
            sum+=(Math.min(left[ind],right[ind]) - height[ind]);
        }
        return  sum;
    }
}