class Solution {
    public int findPermutationDifference(String s, String t) {
        int su=0;
        for(int i=0;i<s.length();i++){
            su+=Math.abs(i-t.indexOf(s.charAt(i)));
        }
        return su;
    }
}