class Solution {
    public String defangIPaddr(String address) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<address.length();i++){
            char ch=address.charAt(i);
            if(ch!='.'){
                st.append(ch);
            }else{
                st.append('[');
                st.append(ch);
                st.append(']');
            }
        }
        return st.toString();
    }
}