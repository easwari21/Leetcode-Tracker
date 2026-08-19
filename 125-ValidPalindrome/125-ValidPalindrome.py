# Last updated: 8/19/2026, 10:40:46 AM
class Solution:
    def isPalindrome(self, s: str) -> bool:
        symbols = 'abcdefghijklmnopqrstuvwxyz1234567890'
        result = ''

        for i in s.lower():
            if i in symbols:
                result += i
        
        return result[::-1] == result