class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> ma=new HashMap<>();

        int[] arr=new int[2];
        for(int i:nums){
            ma.put(i,ma.getOrDefault(i,0)+1);
        }
        for(int i=1;i<=nums.length;i++){
            if(ma.containsKey(i)){
                if(ma.get(i)>1){
                    arr[0]=i;
                }
            }else{
                arr[1]=i;
            }
        }
        return arr;   
    }
}