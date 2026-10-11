class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st= new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n=nums2.length;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(nums2[i]);
                map.put(nums2[i], -1);
            }else{
                map.put(nums2[i], st.peek());
                st.push(nums2[i]);
            }
        }
        int[] res= new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i])){
                res[i]=-1;
            }else{
                res[i]=map.get(nums1[i]);
            }
        }
        return res;
    }
}