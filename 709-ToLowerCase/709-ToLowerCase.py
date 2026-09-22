# Last updated: 9/22/2026, 9:41:49 PM
1class Solution(object):
2    def toLowerCase(self, s):
3        lower_case_str = ""
4        for char in s:
5            ascii_val = ord(char)
6            if 65 <= ascii_val <= 90: 
7                lower_case_str += chr(ascii_val + 32)
8            else:
9                lower_case_str += char
10        return lower_case_str