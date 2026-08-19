// Last updated: 8/19/2026, 10:39:53 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}