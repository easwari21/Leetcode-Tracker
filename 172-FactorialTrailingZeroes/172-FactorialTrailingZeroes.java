// Last updated: 8/19/2026, 10:40:23 AM
class Solution {
    public int trailingZeroes(int n) {
        int sum=0;
        while(n>0){
            n=n/5;
            sum+=n;;
            }
        return sum;
    }
}