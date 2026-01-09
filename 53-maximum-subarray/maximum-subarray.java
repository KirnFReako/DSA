class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0,  maxsoFar = Integer.MIN_VALUE;


        for( int val : nums){
            currSum += val;
            maxsoFar = Math.max(maxsoFar,currSum);

            if(currSum <0){
                currSum =0;
            }
        }
        return maxsoFar;
    }
}