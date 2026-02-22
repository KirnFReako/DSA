class Solution {
    public int maxProfit(int[] prices) {
       int maxP =0;
       int minP =Integer.MAX_VALUE;
       int n= prices.length;

       for( int i =0 ; i< n; i++){
        minP = Math.min(minP, prices[i]);
        maxP = Math.max(maxP, prices[i]-minP);
       }
       return maxP;
    }
}