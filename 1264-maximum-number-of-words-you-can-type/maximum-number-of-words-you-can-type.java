class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words=text.split(" ");
        int wo=0;
        boolean condi=false;
        for(String word:words){
            for(int i=0;i<brokenLetters.length();i++){
                char ch=brokenLetters.charAt(i);
                if(word.contains(String.valueOf(ch))){
                    condi=true;
                }
            }
            if(condi!=true){
                    wo++;
                }
                condi=false;
        }
        return wo;
    }
}