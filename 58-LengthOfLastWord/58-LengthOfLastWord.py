# Last updated: 8/19/2026, 10:41:14 AM
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        return len(s.strip().split()[-1])