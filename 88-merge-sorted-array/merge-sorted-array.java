class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=nums1.length-1;i>=0;i--){
            if(n>0 && m>0){
                if( nums2[n-1]>=nums1[m-1]){
                    nums1[i]=nums2[n-1];
                    n--;
                }else{
                    nums1[i]=nums1[m-1];
                    m--;
                }
            }
        }
        while (n > 0) {
            nums1[n - 1] = nums2[n - 1];
            n--;
        }
    }
}