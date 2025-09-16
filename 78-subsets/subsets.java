class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        ls.add(new ArrayList<>());

        for(int i:nums){
            int size=ls.size();
            for(int j=0;j<size;j++){
                List<Integer> newls= new ArrayList<>(ls.get(j));
                newls.add(i);
                ls.add(newls);
            }
        }
        return ls;
    }
}