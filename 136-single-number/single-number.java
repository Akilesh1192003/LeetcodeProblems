class Solution {
    public int singleNumber(int[] nums)
    {
        int b=0;
        for(int i=0;i<nums.length;i++)
        {
            b=b^nums[i];
        }
        return b;
    }
}