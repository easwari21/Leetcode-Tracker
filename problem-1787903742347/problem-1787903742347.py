# Last updated: 8/28/2026, 1:25:42 PM
1class Solution:
2    def lexPalindromicPermutation(self, s: str, target: str) -> str:
3        n = len(s)
4        count = [0] *26
5        
6        for i in s:
7            count[ord(i) - ord('a')] += 1
8        
9        odd_chars = []
10
11        for i in range(26):
12            if count[i] %2 == 1:
13                odd_chars.append(i)
14            
15        if len(odd_chars) != n % 2:
16            return ''
17        
18        if n % 2 == 1:
19            middle = chr(odd_chars[0] + ord('a'))
20        else:
21            middle = ''
22        
23        remain = [x // 2 for x in count]
24
25        m = n // 2
26        target_left = target[:m]
27
28        prefix = []
29
30        i = 0
31
32        while i < m:
33            c = ord(target_left[i]) - ord('a')
34
35            if remain[c] == 0:
36                break
37            
38            prefix.append(c)
39            remain[c] -= 1 
40            i += 1
41        
42        if i == m:
43            left = ''.join(
44                chr(c + ord('a'))
45                for c in prefix
46            )
47            cadidate = left + middle + left[::-1]
48
49            if cadidate > target:
50                return cadidate
51
52            i = m - 1
53
54        while i >= 0:
55            if len(prefix) > i:
56                restored = prefix.pop()
57                remain[restored] += 1
58
59            target_char = ord(target_left[i]) - ord('a')
60
61            bigger = -1
62
63            for c in range(target_char + 1 ,26):
64                if remain[c] > 0:
65                    bigger = c
66                    break
67            
68            if bigger != -1:
69                remain[bigger] -= 1
70                chars = prefix + [bigger]
71                for c in range (26):
72                    chars.extend([c] * remain[c])
73
74                left = ''.join(
75                    chr(c + ord('a'))
76                    for c in chars
77                )
78
79                return left + middle + left[::-1]
80            
81            i -= 1
82
83        return ''
84
85