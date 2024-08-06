class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int j=0,k=0;
        for(int i=0;i<nums.length;i++)
        {
              if(nums[i]==1){j++;}
              else{if(j>k){
                k=j;j=0;
                }
                else{j=0;}}
        }
        if(j>k){
                k=j;j=0;
                }
        return k;
    }
}