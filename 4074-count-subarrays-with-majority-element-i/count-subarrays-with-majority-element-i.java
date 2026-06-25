class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            int tarCount=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target){
                    tarCount++;
                }
                int len= j-i+1;
                if(tarCount>len/2){
                    res++;
                }
            }
        }
        return res;
    }
}