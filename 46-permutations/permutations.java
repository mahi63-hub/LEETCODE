class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(nums, res, temp);
        return res;
    }

    public void backtrack(int[] nums, List<List<Integer>> res, List<Integer> temp){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int num: nums){
            if(temp.contains(num)){
                continue;
            }
            temp.add(num);
            backtrack(nums, res, temp);
            temp.remove(temp.size()-1);
        }
        return;
    }
}