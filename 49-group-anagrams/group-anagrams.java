class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String i: strs){
            char[] ch = i.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            if(!map.containsKey(s)){
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(i);
        }

        List<List<String>> ls= new ArrayList<>();
        for(String i: map.keySet()){
            ls.add(map.get(i));
        }
        return ls;
    }
}