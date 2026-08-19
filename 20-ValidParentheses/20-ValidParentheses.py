# Last updated: 8/19/2026, 10:42:18 AM
class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for char in s:
            if char ==('('):
                stack.append(')')
            elif char == ('{'):
                stack.append('}')
            elif char == ('['):
                stack.append(']')
            elif not stack or stack.pop()!=char:
                return False
        return not stack    