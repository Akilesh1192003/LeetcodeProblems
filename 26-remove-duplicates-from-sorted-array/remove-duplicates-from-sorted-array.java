class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;int j=1;
        nums[0]=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i-1]!=nums[i]){
                nums[j]=nums[i];
                j++;
            }
            else{

            }
        }
        return j;
    }
}