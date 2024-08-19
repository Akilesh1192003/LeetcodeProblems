class Solution
{
    public int removeDuplicates(int[] nums)
    {
        int n=nums.length;
        int a=nums[0];int j=1;
        for(int i=1;i<n;i++)
        {
            int b=nums[i];
         if(a==b)
         {
         }
         else{
            nums[j]=b;
            a=b;
            j++;
         }
        }
        return j;
    }
}