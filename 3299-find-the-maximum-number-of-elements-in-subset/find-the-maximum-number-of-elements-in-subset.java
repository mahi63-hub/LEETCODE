class Solution {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> ma= new HashMap<>();
        for(long i: nums){
            ma.put(i, ma.getOrDefault(i,0)+1);
        }

        int maxNum= Integer.MIN_VALUE;

        if(ma.containsKey(1L)){
            int cnt=ma.get(1L);
            int len = (cnt%2==0)?cnt-1 : cnt;
            maxNum=Math.max(len, maxNum);
        }

        for(long j : ma.keySet()){
            long idx=j;
            int len=0;
            if(j==1){
                continue;
            }
            while(ma.containsKey(idx)){
                if(ma.containsKey(idx*idx) && ma.get(idx)>=2){
                    len+=2;
                    idx=idx*idx;
                }else {
                    len+=1;
                    break;
                }
            }
            maxNum=Math.max(len, maxNum);
        }
        return maxNum;
    }
}