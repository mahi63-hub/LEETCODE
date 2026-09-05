class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<String> strs= new Stack<>();
        int num=0;
        String curr="";
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10 + (ch-'0');
            }else if(ch =='['){
                nums.push(num);
                strs.push(curr);
                num=0;
                curr="";
            }else if(ch==']'){
                int count=nums.pop();
                String prev=strs.pop();
                String repeat="";
                for(int j=0;j<count;j++){
                    repeat+=curr;
                }
                curr=prev+repeat;
            }else{
                curr+=ch;
            }
        }
        return curr;
    }
}