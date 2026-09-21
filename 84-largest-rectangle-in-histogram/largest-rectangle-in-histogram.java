class Solution {
    public int largestRectangleArea(int[] heights) {
        int prev[] = new int[heights.length];
        int next[] = new int[heights.length];
        Stack<Integer> st=new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                st.pop();
            }
            next[i]=st.isEmpty() ? heights.length : st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            prev[i]=st.isEmpty() ? -1: st.peek();
            st.push(i);
        }
        int max=0;
        for(int i=0;i<heights.length;i++){
            int width=next[i]-prev[i]-1;
            int area=heights[i]*width;
            max=Math.max(max,area);
        }
        return max;
    }
}