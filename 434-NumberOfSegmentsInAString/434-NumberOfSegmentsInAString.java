// Last updated: 8/19/2026, 10:38:54 AM
class Solution {
    public int countSegments(String s) {
       String[] arr = s.split(" ");
        int count = 0;
        for (String i : arr)
            if (i.length() != 0)
                count++;
        return count;
    }
}