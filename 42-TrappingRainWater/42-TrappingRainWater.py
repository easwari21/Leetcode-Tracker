# Last updated: 8/19/2026, 10:41:43 AM
class Solution:
    def trap(self, height: List[int]) -> int:
        leftwall = rightwall = 0
        n = len(height)
        left = [0] *n
        right = [0] * n
        for i in range(n):
            j=-i-1
            left[i]=leftwall
            right[j]=rightwall
            leftwall=max(leftwall,height[i])
            rightwall=max(rightwall,height[j])
        total=0
        for k in range(n):
            minimum = min(left[k], right[k])
            total += max(0,minimum-height[k])
        return total

        