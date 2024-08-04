class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] output=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<=nums.length-1;i++){
            int key=target-nums[i];
            if(map.containsKey(key)){
              
              output[0]=map.get(key);
              output[1]=i;
              return output;
            }
            map.put(nums[i],i);
        }
        return output;
    }
}