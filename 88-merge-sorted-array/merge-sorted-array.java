class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m+n];

        for( int i =0;i<m;i++){
            merged[i] = nums1[i];

         }
         for(int j=0;j<n;j++){
            merged[m+j] = nums2[j];
         }

         for(int i =0 ; i< merged.length-1;i++){
            for(int j =0; j< merged.length-i-1;j++){
                if(merged[j] > merged[j+1]){
                    int temp = merged[j];
                    merged[j] = merged[j+1];
                    merged[j+1] = temp;
                }
            }
         }
         for (int i = 0; i < m + n; i++) {
            nums1[i] = merged[i];
        }
        
    }
}