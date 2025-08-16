class Solution {
    public int maximum69Number (int num) {
        String st=String.valueOf(num);
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='6'){
                st=st.replaceFirst("6","9");
                return Integer.parseInt(st);
            }
        }
        return num;
    }
}