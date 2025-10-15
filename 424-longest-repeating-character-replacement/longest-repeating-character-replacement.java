class Solution {
    public int characterReplacement(String s, int k) {
        int l=0, maxlen=0, maxcount=0;
        int[] arr = new int[26];
        for(int r=0;r<s.length();r++){
            maxcount=Math.max(maxcount, ++arr[s.charAt(r)-'A']);
            while((r-l+1)-maxcount > k ){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen, r-l+1);
        }
        return maxlen;
    }
}