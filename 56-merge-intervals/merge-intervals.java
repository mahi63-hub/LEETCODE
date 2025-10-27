class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> ls=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);
            }else{
                ls.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        ls.add(new int[]{start, end});
        return ls.toArray(new int[ls.size()][]);
    }
}