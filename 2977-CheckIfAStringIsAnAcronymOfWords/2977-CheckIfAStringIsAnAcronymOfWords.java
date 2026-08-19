// Last updated: 8/19/2026, 10:36:01 AM
class Solution {
    public boolean isAcronym(List<String> words, String s) { 
        String ans ="";
        for(String i : words)
        {
           char c = i.charAt(0);
           ans=ans+c; 
        }
        return ans.equals(s);
    }
}