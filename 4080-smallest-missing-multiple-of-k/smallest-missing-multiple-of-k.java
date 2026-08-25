class Solution {
    public int missingMultiple(int[] nums, int k) {
    int n = nums.length;
    int ans = 0;
    HashSet<Integer> obj = new HashSet<>();
    for(int i = 0;i<n;i++){
      if(obj.contains(nums[i])){
        System.out.println(nums[i]);
      }
      else{
        obj.add(nums[i]);
      }
    }
    for(int i = 1;i<=10000;i++){
      if(!obj.contains(k*i)){
            ans = k*i;
            break;
      }
    }
    return ans;
    }
}