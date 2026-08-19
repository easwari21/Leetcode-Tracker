// Last updated: 8/19/2026, 10:36:46 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++)
        {
                sum+=mat[i][i]+mat[i][n-i-1];
        }
        if(n%2!=0)
            sum=sum-mat[n/2][n/2];
        return sum;
    }
}