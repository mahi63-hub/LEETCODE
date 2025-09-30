class Solution {
    public int triangularSum(int[] nums) {
        int r=nums.length-1,l=0;
        while(r>=0){
            l=0;
            while(l<r){
                nums[l]=(nums[l]+nums[l+1])%10;
                l++;
            }
            r--;
        }
        return nums[0];
    }
}