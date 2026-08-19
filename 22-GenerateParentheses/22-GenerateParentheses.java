// Last updated: 8/19/2026, 10:42:15 AM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res= new ArrayList<String>();
        process(res,0,0,"",n);
        return res;
    }
    public static void process(List<String> res,int open,int close,String s,int n)
    {
        if(s.length()==n*2)
        {
            res.add(s);
            return;
        }
        if(open<n)
        process(res,open+1,close,s+"(",n);
        if(close<open)
        process(res,open,close+1,s+")",n); 
    }

}
