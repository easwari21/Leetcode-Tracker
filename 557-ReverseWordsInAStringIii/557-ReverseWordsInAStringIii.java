// Last updated: 8/19/2026, 10:38:33 AM
class Solution {
    public String reverseWords(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        int i = 0;
        for (int j = 0; j <= n; j++) 
        {
            if (j == n || a[j] == ' ')
             {
                int start = i , end = j - 1;
                while(start<end) {
                    char temp = a[start];
                    a[start] = a[end];
                    a[end] = temp;

                    start++;
                    end--;
                }
                i = j + 1;
            }
        }
        return new String(a);
    }
}