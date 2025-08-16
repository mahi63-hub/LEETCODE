class Solution {
    public List<String> stringMatching(String[] words) {
          List<String> st=new ArrayList<>();
          for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i==j){
                    continue;
                }else if(words[i].contains(words[j]) && !st.contains(words[j])){
                    st.add(words[j]);
                }
            }
          }
          return st;
    }
}