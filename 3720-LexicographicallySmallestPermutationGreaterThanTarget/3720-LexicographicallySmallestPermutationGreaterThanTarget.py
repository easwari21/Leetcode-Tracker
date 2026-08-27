# Last updated: 8/27/2026, 1:40:55 PM
1class Solution:
2    def lexGreaterPermutation(self, s: str, target: str) -> str:
3        count = [0] * 26
4        for ch in s:
5            count[ord(ch) - ord('a')] += 1
6
7        n = len(s)
8        matched = 0
9
10        while matched < n and count[ord(target[matched]) - ord('a')] > 0:
11            count[ord(target[matched]) - ord('a')] -= 1
12            matched += 1
13
14        start = matched if matched < n else n - 1
15
16        for i in range(start, -1, -1):
17            if i < matched:
18                count[ord(target[i]) - ord('a')] += 1
19
20            bigger = -1
21            for ch in range(ord(target[i]) - ord('a') + 1, 26):
22                if count[ch] > 0:
23                    bigger = ch
24                    break
25
26            if bigger != -1:
27                count[bigger] -= 1
28
29                answer = target[:i] + chr(ord('a') + bigger)
30
31                for ch in range(26):
32                    answer += chr(ord('a') + ch) * count[ch]
33
34                return answer
35
36        return ""