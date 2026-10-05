class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st= new Stack<>();
        int score=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                st.push(score);
                score=0;
            }else{
                if(score==0){
                    score=1;
                }else{
                    score=2*score;
                }
                score+=st.pop();
            }
        }
        return score;
    }
}