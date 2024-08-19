class Solution {
    public void moveZeroes(int[] nums)
    {
        int n=nums.length;
        int j=0;
        int k=0;int a=0;
        while(j<n)
        {
           if(nums[j]==0)
           {
            k++;
           }
           else
           {
            nums[a]=nums[j];
            a++;
           }
           j++;
        }
        for(int i=a;i<n;i++)
        {
            nums[i]=0;
        }
    }
}