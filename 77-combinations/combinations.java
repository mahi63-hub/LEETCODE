class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp= new ArrayList<>();
        combinations(1,n, k, res, temp);
        return res;
    }

    public void combinations(int start, int n, int k, List<List<Integer>> res, List<Integer> temp){
        if(temp.size()==k){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            combinations(i+1, n, k, res, temp);
            temp.remove(temp.size()-1);
        }
    }
}