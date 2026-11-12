class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<List<Integer>> ls = new ArrayList<>();
        int start= newInterval[0], end= newInterval[1], i=0;

        //add list which are not overlapping.
        while(i<intervals.length && start > intervals[i][1]){
            ls.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            i++;
        }

        //update start, end when it's overlapping.
        while(i<intervals.length && end>=intervals[i][0]){
            start= Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }

        ls.add(Arrays.asList(start, end));

        //add non-laping intervals after lapping ones.
        while(i<intervals.length){
            ls.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            i++;
        }

        int[][] res = new int[ls.size()][2];

        for ( i = 0; i < ls.size(); i++) {
            res[i][0] = ls.get(i).get(0);
            res[i][1] = ls.get(i).get(1);
        }

        return res;
    }
}