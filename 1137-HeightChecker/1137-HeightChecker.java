// Last updated: 8/19/2026, 10:37:34 AM
class Solution {
    public int heightChecker(int[] heights) {
        int[] s= heights.clone();
        Arrays.sort(s);
        int count=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=s[i])
            {
                count++;
            }
        }
        return count;
    }
}