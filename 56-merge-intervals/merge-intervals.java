class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        ArrayList<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>(Arrays.asList(
                intervals[0][0],
                intervals[0][1])));

        for (int i = 1; i < intervals.length; i++) {

            int[] curr = intervals[i];

            List<Integer> prev = res.get(res.size() - 1);

            if (prev.get(1) >= curr[0]) {
                prev.set(1, Math.max(prev.get(1), curr[1]));
            } else {
                res.add(new ArrayList<>(Arrays.asList(
                        curr[0],
                        curr[1])));
            }
        }

        int[][] ans = new int[res.size()][2];

        for (int i = 0; i < res.size(); i++) {
            ans[i][0] = res.get(i).get(0);
            ans[i][1] = res.get(i).get(1);
        }

        return ans;
    }
}