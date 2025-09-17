class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int left=0,maxLen=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxLen=Math.max(maxLen,r-left+1);
        }
        return maxLen;
    }
}