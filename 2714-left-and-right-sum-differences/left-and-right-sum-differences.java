class Solution {
    public int[] leftRightDifference(int[] nums) {
       int  n=nums.length;
        int[] arr=new int[n];
        return Difference(nums,arr,n);
    }
    public int[] Difference(int[] nums,int[] arr,int n){
         int[] left=new int[n];
         int[] right=new int[n];
         left[0]=0;
         right[n-1]=0;
         for(int i=1;i<=n-1;i++){
          left[i]=left[i-1]+nums[i-1];
         }
         for(int j=n-2;j>=0;j--){
          right[j]=right[j+1]+nums[j+1];
         }
         for(int i=0;i<n;i++){
            if(left[i]-right[i]>=0){
            arr[i]=left[i]-right[i];}
            else{
                arr[i]=right[i]-left[i];
            }
         }
         return arr;
    }
}