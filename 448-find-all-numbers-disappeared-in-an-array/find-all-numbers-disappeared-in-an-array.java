class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        List<Integer> ls=new ArrayList<>();
        int n=nums.length;
        for(int i:nums){
            set.add(i);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                ls.add(i);
            }
        }
        return ls;
    }
}