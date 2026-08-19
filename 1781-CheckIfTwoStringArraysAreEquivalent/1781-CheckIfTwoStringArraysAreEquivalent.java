// Last updated: 8/19/2026, 10:36:41 AM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String u= "";
        String v = "";
        for(String ch :word1)
            u+=ch;
        for(String c:word2)
            v+=c;
        return u.equals(v);
    }
}