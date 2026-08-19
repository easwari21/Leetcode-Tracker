// Last updated: 8/19/2026, 10:42:04 AM
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
    return -1;
    }
}