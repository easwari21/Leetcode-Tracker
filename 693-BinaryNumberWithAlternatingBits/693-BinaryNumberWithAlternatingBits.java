// Last updated: 8/19/2026, 10:38:20 AM
class Solution {
    public boolean hasAlternatingBits(int n) {
        String m = Integer.toBinaryString(n);
        for(int i=1;i<m.length();i++)
        {
            if(m.charAt(i-1)==m.charAt(i))
            {
                return false;
            }
        }
        return true;
}
}