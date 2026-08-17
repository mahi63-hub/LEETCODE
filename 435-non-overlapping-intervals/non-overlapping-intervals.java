class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[1],b[1]));
        int count=0, idx= intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            // idx refers to end
            if(idx>intervals[i][0]){
                count++;
            }else{
                idx=intervals[i][1];
            }
        }
        return count;
    }
}