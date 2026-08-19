// Last updated: 8/19/2026, 10:40:20 AM
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reverse = 0;
        int bits = Integer.SIZE; 

        for (int i = 0; i < bits; i++) {
            reverse<<= 1; 
            reverse |= (n & 1); 
            n >>= 1; 
        }
 return reverse;
    }
}