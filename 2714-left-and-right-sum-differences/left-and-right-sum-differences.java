class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left=0,right=0,n=nums.length;
        int[] res= new int[n];
        for(int i=0;i<n;i++){
            res[i]=left;
            left+=nums[i];
        }

        for(int j=n-1;j>=0;j--){
            res[j]= Math.abs(res[j]-right);
            right+=nums[j];
        }

        return res;
    }
}