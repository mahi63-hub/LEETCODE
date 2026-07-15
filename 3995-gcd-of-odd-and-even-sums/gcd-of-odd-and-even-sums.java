class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even=0, odd=0, i=1;
        while (i <= n) {
            odd+=(2 * i - 1); 
            even+=(2 * i);    
            i++;
        }
        return gcd(odd, even);
    }

    public int gcd(int a, int b) {
        while (b!=0) {
            int temp=b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}