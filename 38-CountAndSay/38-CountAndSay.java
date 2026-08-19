// Last updated: 8/19/2026, 10:41:47 AM
class Solution {
    public String countAndSay(int n) {
         String s = "1";
         for(int k=1;k<n;k++)
         {
            String res="";
            int i=0,j=0,c=0;
            while(i<s.length())
            {
                while(j<s.length() && (s.charAt(i)==(s.charAt(j))))
                {
                    c++;
                    j++;
                }
                    res+=c;
                    res+=s.charAt(i);
                    i=j;
                    c=0;
                }
                s=res;
            }
        return s;
    }
}
