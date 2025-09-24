class Solution {
    public char kthCharacter(int k) {
        StringBuilder s=new StringBuilder("a");
        while(s.length()<k){
            StringBuilder newString=new StringBuilder();
            for(int i=0;i<s.length();i++){
                char last=s.charAt(i);
                char nextChar=(last=='z')?'a':(char)(last+1);
                newString.append(nextChar);
            }
            s.append(newString);
        }
        return s.charAt(k-1);
    }
}