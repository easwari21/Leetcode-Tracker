# Last updated: 8/19/2026, 10:39:42 AM
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        return Counter(s)==Counter(t)