class Solution {
    public int singleNumber(int[] nums)
    { int n=nums.length;
        int b=0;
        for(int i=0;i<n;i++)
        {
            b=b^nums[i];
        }
        return b;
    }
}