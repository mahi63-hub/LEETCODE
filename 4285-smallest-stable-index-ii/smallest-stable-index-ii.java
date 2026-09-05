class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] minIndex = new int[n];
        minIndex[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(nums[i]<minIndex[i+1]){
                minIndex[i]=nums[i];
            }else{
                minIndex[i]=minIndex[i+1];
            }
        }
        int max=nums[0];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            if(max-minIndex[i]<=k){
                return i;
            }
        }
        return -1;
    }
}