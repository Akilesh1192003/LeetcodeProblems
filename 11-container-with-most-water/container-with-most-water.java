class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int max=0;
        while(left<right)
        {   int m=right-left;
            int min=Math.min(height[left],height[right]);
            max= Math.max(max,min*m);
          if(height[left]<height[right])
          {
            left++;
           }
          else
          {
            right--;
          }

        }
        return max;
    }
}