# Last updated: 9/18/2026, 9:44:17 PM
1class Solution:
2    def maxNumOfSubstrings(self, s):
3        n = len(s)
4        first = [n] * 26
5        last = [-1] * 26
6        for i, ch in enumerate(s):
7            c = ord(ch) - ord('a')
8            first[c] = min(first[c], i)
9            last[c] = i
10
11        intervals = []
12        for c in range(26):
13            if last[c] == -1:
14                continue
15
16            l, r = first[c], last[c]
17            valid = True
18
19            i = l
20            while i <= r:
21                x = ord(s[i]) - ord('a')
22                if first[x] < l:
23                    valid = False
24                    break
25                r = max(r, last[x])
26                i += 1
27
28            if valid:
29                intervals.append((r, l))
30        intervals.sort()
31
32        ans = []
33        prevEnd = -1
34
35        for r, l in intervals:
36            if l > prevEnd:
37                ans.append(s[l:r + 1])
38                prevEnd = r
39
40        return ans