class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l=0,r=0,maxLen=1;
        while(r<nums.length){
            map.put(nums[r], map.getOrDefault(nums[r],0)+1);
            if(map.get(nums[r])>k){
                maxLen=Math.max(maxLen, r-l);
                while(map.get(nums[r])>k){
                    map.put(nums[l],map.get(nums[l])-1);
                    l++;
                }
            }
            r++;
        }
        maxLen=Math.max(maxLen, r-l);
        return maxLen;
    }
}