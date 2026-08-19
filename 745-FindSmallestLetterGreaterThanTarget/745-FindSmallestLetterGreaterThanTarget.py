# Last updated: 8/19/2026, 10:38:11 AM
class Solution(object):
    def nextGreatestLetter(self, letters, target):
        found=False
        for i in letters:
            if i>target:
                found=True
            if found:
                return i
                break
        return min(letters)

    