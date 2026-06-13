class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder st= new StringBuilder();
        for(String s: words){
            int res=0;
            for(int i=0;i<s.length();i++){
                res+=weights[s.charAt(i)-'a'];
            }
            char modulo = (char) ('z'-(res%26));
            st.append(modulo);
        }
        return st.toString();
    }
}