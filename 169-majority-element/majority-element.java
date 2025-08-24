class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> ma=new HashMap<>();
        for(int i:nums){
            ma.put(i,ma.getOrDefault(i,0)+1);
        }

        for(int i:ma.keySet()){
            if(ma.get(i)>nums.length/2){
                return i;
            }
        }
        return -1;
    }
}