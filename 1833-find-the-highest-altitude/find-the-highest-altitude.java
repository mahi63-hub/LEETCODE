class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int res= 0;
        int alt=0;
        for(int i=0;i<n;i++){
            alt+=gain[i];
            res=Math.max(res, alt);
        }
        return res;
    }
}