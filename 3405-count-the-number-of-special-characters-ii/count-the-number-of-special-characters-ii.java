class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;

        HashMap<Character, Integer> lower = new HashMap<>();
        HashMap<Character, Integer> upper = new HashMap<>();

        for(int i=0;i<word.length();i++) {
            char alpha = word.charAt(i);
            if(Character.isLowerCase(alpha)) {
                lower.put(alpha, i);
            }else if(!upper.containsKey(Character.toLowerCase(alpha))) {
                upper.put(Character.toLowerCase(alpha), i);
            }
        }

        for(char ch: lower.keySet()){
            if(upper.containsKey(ch) && upper.get(ch)> lower.get(ch)){
                count++ ;
            }
        }

        return count;
    }
}