class Solution {
    public List<Integer> majorityElement(int[] nums) {

      HashMap<Integer,Integer> map = new HashMap<>();
      List<Integer> result = new ArrayList<>();

      for( int i=0;i<nums.length;i++){
        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
      }

      for(int keys : map.keySet() ){
        if(map.get(keys)> nums.length/3){
            result.add(keys);
        }
      }
      return result;
    }
}