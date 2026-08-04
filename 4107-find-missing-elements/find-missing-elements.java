class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int low= 0,high=nums.length-1;
        ArrayList<Integer> ls = new ArrayList<>();
        while(nums[low]<nums[high]){
            if(nums[low+1]!=nums[low]+1){
                ls.add(nums[low]+1);
                nums[low]=nums[low]+1;
            }else{
                low++;
            }
        }        
        return ls;
    }
}