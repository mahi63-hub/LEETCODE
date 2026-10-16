class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        subSets(nums, 0, res, curr);
        return res;
    }

    public void subSets(int[] nums, int start, List<List<Integer>> res, List<Integer> curr){
        res.add(new ArrayList<>(curr));
        for(int i=start;i<nums.length;i++){
            curr.add(nums[i]);
            subSets(nums, i+1, res, curr);
            curr.remove(curr.size()-1);
        }
    }
}