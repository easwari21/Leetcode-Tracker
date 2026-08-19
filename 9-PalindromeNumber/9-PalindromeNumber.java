// Last updated: 8/19/2026, 10:42:36 AM
class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int rev=0;
        while(n>0){
            rev=(rev*10)+(n%10);
            n/=10;
        }
        if(rev==x) return true;
        else return false;
    }
}