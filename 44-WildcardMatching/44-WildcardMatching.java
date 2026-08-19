// Last updated: 8/19/2026, 10:41:32 AM
class Solution {
    public boolean isMatch(String t, String p) {
        int l1=t.length();
        int l2=p.length();
        boolean dp[][] =new boolean[l1+1][l2+1];
        dp[0][0]=true;
        for(int i=1;i<=l2;i++)
        {
            if(p.charAt(i-1)=='*')
            dp[0][i]=dp[0][i-1];
        }
        for(int i=1;i<=l1;i++)
        {
            for(int j=1;j<=l2;j++)
            {
                if(t.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='?')
                    dp[i][j]=dp[i-1][j-1];
                else if(p.charAt(j-1)=='*')
                    dp[i][j]=dp[i][j-1]||dp[i-1][j];
                else 
                    dp[i][j]= false;
            }
        }
        return dp[l1][l2];
    }
}