class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max=-1;
        for(int i: nums){
            int sum=sumOfDigi(i);
            if(map.containsKey(sum)){
                max=Math.max(map.get(sum)+i, max);
                if(map.get(sum)<i){
                    map.put(sum,i);
                }
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }

    public int sumOfDigi(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}