// Last updated: 8/19/2026, 10:35:32 AM
class Solution {
    public int possibleStringCount(String word)
     {
        int count=1;
        for(int i=1;i<word.length();i++)
        {
            if(word.charAt(i-1)==word.charAt(i))
            count++;
        }
        return count;
    }
}