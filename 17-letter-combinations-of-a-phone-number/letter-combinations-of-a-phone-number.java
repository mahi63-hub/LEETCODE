class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        List<String> res = new ArrayList<>();
        phoneNumberCombinations(map, res, "", digits, 0);
        return res;
    }

    public void phoneNumberCombinations(String[] map, List<String> res, String curr,String digits, int start){
        if(curr.length()==digits.length()){
            res.add(new String(curr));
            return;
        }

        for(int i=start;i<digits.length();i++){
            String st = map[digits.charAt(i)-'0'];
            for(char ch: st.toCharArray()){
                curr+=ch;
                phoneNumberCombinations(map, res, curr, digits, i+1);
                curr = curr.substring(0, curr.length()-1);
            }
        }
    }
}