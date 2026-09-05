class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = 0;
        
        int score = 0;
        for(int i = 0;i<nums.length;i++){
       max = Math.max(max, nums[i]);
       int min = Integer.MAX_VALUE;
       for(int j = i;j<=nums.length -1 ;j++){
            min = Math.min(min,nums[j]);
       }
         score = max - min;

    if(score <= k) {
        return i ;
    }
        } 
       return -1;
    }
}