class Solution {
    public int singleNumber(int[] nums) {
     int n=nums.length;
     int k=0;
     for(int i=0;i<n;i++)
     {
        int c=0;
        int nu=nums[i];
        for(int j=0;j<n;j++)
        {
            if(nums[j]==nu&&i!=j)
            {
                c++;
            }
        }
        if(c==0)
        {
            k=nu;
            break;
        }

     }
     return k;
     
    }
}