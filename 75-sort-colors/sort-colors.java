class Solution
{
    public void sortColors(int[] nums)
    {int n=nums.length;
      int r=0;int b=0;int w=0;
      for(int i=0;i<n;i++)
      {
        if(nums[i]==0)
        {
          r++;
        }
        else if(nums[i]==1)
        {
           w++;
        }
        else{
            b++;
        }
      }        
      for(int i=0;i<r;i++)
      {
        nums[i]=0;
      }
       for(int i=0;i<w;i++)
      {
        nums[i+r]=1;
      }
       for(int i=0;i<b;i++)
      {
        nums[i+r+w]=2;
      }
    }
}