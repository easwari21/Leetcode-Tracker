# Last updated: 8/23/2026, 9:22:27 PM
1class Solution:
2    def sumGame(self, num: str) -> bool:
3        n = len(num)
4        left_sum = 0
5        right_sum = 0
6        left_q = 0
7        right_q = 0
8
9        for i, char in enumerate(num):
10            is_left = i < (n // 2)
11            
12            if char == "?":
13                if is_left:
14                    left_q += 1
15                else:
16                    right_q += 1
17            else:
18                digit = int(char)
19                if is_left:
20                    left_sum += digit
21                else:
22                    right_sum += digit
23
24        if (left_q + right_q) % 2 != 0:
25            return True
26        expected_left = (left_sum) + (4.5 * left_q)
27        expected_right = (right_sum) + (4.5 * right_q)
28        
29        return expected_left != expected_right
30
31
32