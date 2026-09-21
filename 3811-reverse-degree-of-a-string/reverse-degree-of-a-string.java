class Solution {
    public int reverseDegree(String s) {
        int res=0, index=1;
        for(char ch: s.toCharArray()){
            res+=(26-(ch-'a'))*index;
            index++;
        }
        return res;
    }
}