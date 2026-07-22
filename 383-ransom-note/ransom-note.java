class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char i: ransomNote.toCharArray()){
            map1.put(i, map1.getOrDefault(i,0)+1);
        }
        for(char i: magazine.toCharArray()){
            map2.put(i, map2.getOrDefault(i,0)+1);
        }
        
        for(char i: map1.keySet()){
            if(!map2.containsKey(i) || map1.get(i)>map2.get(i)){
                return false;
            }
        }
        return true;
    }
}