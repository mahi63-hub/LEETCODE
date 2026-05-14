class Solution {
    public boolean isGood(int[] nums) {
        int max=Integer.MIN_VALUE;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(max<i){
                max=i;
            }
        }
        for(int j:map.keySet()){
            if(j!=max && map.get(j)>1){
                return false;
            }
        }
        
        return map.get(max)==2 && nums.length==max+1;
    }
}