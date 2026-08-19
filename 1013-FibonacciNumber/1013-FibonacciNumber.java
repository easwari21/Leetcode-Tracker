// Last updated: 8/19/2026, 10:37:47 AM
class Solution {
    public int fib(int n) {
        if( n <= 1 ) return n ;
        int prev2  = 0 ;
        int prev1 = 1;
        int next = 0 ;
        for( int i = 2 ; i <= n ; i++ ){
            next = prev1 + prev2 ;
            prev2 = prev1 ;
            prev1 = next ;
        }
        return next ;
    }
}