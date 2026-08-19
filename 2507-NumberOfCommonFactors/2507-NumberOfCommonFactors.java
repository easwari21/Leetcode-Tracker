// Last updated: 8/19/2026, 10:36:09 AM
class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int m=Math.min(a,b);
        int n=Math.max(a,b);
        for(int i=1;i<=m;i++){
            if(n%i==0 && m%i==0){
                count++;
            }
        }
        return count;
    }
}