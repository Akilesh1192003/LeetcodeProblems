class Solution
{
    public int removeDuplicates(int[] nums)
    {
        int n=nums.length;
        int a=nums[0];int j=0;
        for(int i=1;i<n;i++)
        {
            int b=nums[i];
         if(a==b)
         {
         }
         else{
            nums[j+1]=b;
            a=b;
            j++;
         }
        }
        return j+1;
    }
}