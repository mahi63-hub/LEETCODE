class Solution {
    public int maxFreqSum(String s) {
        String vo="aeiou";
        Map<Character,Integer> map=new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int vowels=0,consts=0;
        for(char ch:map.keySet()){
            if(vo.contains(String.valueOf(ch))){
                if(map.get(ch)>vowels){
                    vowels=map.get(ch);
                }
            }else{
                if(map.get(ch)>consts){
                    consts=map.get(ch);
                }
            }
        }

        return vowels+consts;
    }
}