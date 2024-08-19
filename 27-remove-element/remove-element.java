class Solution
{
    public int removeElement(int[] nums, int val) 
    {
     int n=nums.length;
     int a=0;
     int b=0;
     while(b<n)
     {
        if(nums[b]==val){
        }
        else{
           nums[a]=nums[b];
           a++;
        }
        b++;
     }
     return a;
    }
}