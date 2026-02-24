class Solution {
    public int removeDuplicates(int[] nums) {
      HashSet<Integer> seen = new HashSet<>();

      int idx=0;

      for( int i=0; i< nums.length;i++){
        if(!seen.contains(nums[i])){
            seen.add(nums[i]);
            nums[idx++] = nums[i];
        }
      }
      return idx;

     

    }




}