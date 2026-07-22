class Solution {
    public int numIdenticalPairs(int[] nums) {
        //(n*(n-1))/2 -- formula
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;

        for(int x:nums){
            ans+=map.getOrDefault(x,0);
            map.put(x,map.getOrDefault(x,0)+1);
        }

        return ans;
    }
}