class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int n = nums.length;
        int[] ans = new int[n];

        int less = 0;
        int equalCount = 0;

        for(int num : nums){
            if(num < pivot) less++;
            else if(num == pivot) equalCount++;
        }

        int left = 0;
        int mid = less;
        int right = less + equalCount;

        for(int num : nums){

            if(num < pivot){
                ans[left++] = num;
            }
            else if(num == pivot){
                ans[mid++] = num;
            }
            else{
                ans[right++] = num;
            }
        }

        return ans;
    }
}