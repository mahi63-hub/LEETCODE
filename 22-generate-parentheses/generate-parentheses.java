class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate("", 0, 0, n, res);
        return res;
    }

    public static void generate(String curr, int open, int close, int n, List<String> res){
        if(curr.length()==n*2){
            res.add(curr);
            return;
        }

        if(open<n){
            generate(curr+"(", open+1, close, n, res);
        }

        if(close<open){
            generate(curr+")", open, close+1, n, res);
        }
    }
}