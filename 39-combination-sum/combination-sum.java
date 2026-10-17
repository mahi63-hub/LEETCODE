class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        combinationsSum( candidates, res, curr, 0, target, 0);
        return res;
    }

    public void combinationsSum(int[] candidates, List<List<Integer>> res, List<Integer> curr, int sum, int target, int start){
        if(sum==target){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(sum>target){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            sum+=candidates[i];
            curr.add(candidates[i]);
            combinationsSum(candidates, res, curr, sum, target, i);
            sum-=curr.get(curr.size()-1);
            curr.remove(curr.size()-1);
        }
    }
}