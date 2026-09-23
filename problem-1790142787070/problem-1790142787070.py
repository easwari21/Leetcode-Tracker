# Last updated: 9/23/2026, 11:23:07 AM
1class Solution:
2    def romanToInt(self, s: str) -> int:
3        translations = {
4            "I": 1,
5            "V": 5,
6            "X": 10,
7            "L": 50,
8            "C": 100,
9            "D": 500,
10            "M": 1000
11        }
12        
13        s = s.replace("IV", "IIII").replace("IX", "VIIII")
14        s = s.replace("XL", "XXXX").replace("XC", "LXXXX")
15        s = s.replace("CD", "CCCC").replace("CM", "DCCCC")
16        
17        total = 0
18        for char in s:
19            total += translations[char]
20            
21        return total