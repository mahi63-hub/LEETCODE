class Solution {
    public int smallestNumber(int n) {
        int bin = 0, i = 0;
        while (bin < n) {
            bin = bin + (int)Math.pow(2, i);
            i++;
        }
        return bin;
    }
}
