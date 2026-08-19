// Last updated: 8/19/2026, 10:38:48 AM
class Solution {
    
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) 
    {
        int s1Len = s1.length();
        int s2Len = s2.length();
        int[] repeatCount = new int[n1 + 1];
        int[] nextIndex = new int[n1 + 1];

        HashMap<Integer, Integer> seen = new HashMap<>();

        int j = 0;     
        int count = 0;  
        for (int i = 1; i <= n1; i++) {
            for (int k = 0; k < s1Len; k++) {
                if (s1.charAt(k) == s2.charAt(j)) {
                    j++;
                    if (j == s2Len) {
                        j = 0;
                        count++;
                    }
                }
            }

            repeatCount[i] = count;
            nextIndex[i] = j;
            if (seen.containsKey(j)) {
                int prev = seen.get(j);
                int cycleLen = i - prev;
                int cycleCount = repeatCount[i] - repeatCount[prev];

                int remaining = n1 - prev;
                int cycles = remaining / cycleLen;

                int result = repeatCount[prev] + cycles * cycleCount;
                int rest = remaining % cycleLen;

                result += repeatCount[prev + rest] - repeatCount[prev];
                return result / n2;
            }

            seen.put(j, i);
        }

        return repeatCount[n1] / n2;
    }
}