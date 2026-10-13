class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Long> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(long i: gifts){
            pq.offer(i);
        }

        long i=0;
        long res=0;
        while(i!=k){
            long newNum= (long) Math.sqrt(pq.poll());
            pq.offer(newNum);
            i++;
        }

        while(!pq.isEmpty()){
            res+=pq.poll();
        }

        return res;
    }
}