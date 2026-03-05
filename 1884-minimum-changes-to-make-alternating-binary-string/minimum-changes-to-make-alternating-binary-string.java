class Solution {
    public int minOperations(String s) {
        int start_0 = 0, start_1 = 0;

        for(int i = 0; i < s.length(); i++){
            int num = s.charAt(i) - '0';

            if((i % 2 == 0 && num != 0) || (i % 2 == 1 && num != 1)){
                start_0++;
            }

            if((i % 2 == 0 && num != 1) || (i % 2 == 1 && num != 0)){
                start_1++;
            }
        }

        return Math.min(start_0, start_1);
    }
}