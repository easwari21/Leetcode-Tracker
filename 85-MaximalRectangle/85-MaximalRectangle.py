# Last updated: 8/19/2026, 10:40:53 AM
class Solution(object):
    def maximalRectangle(self, matrix):
        """
        :type matrix: List[List[str]]
        :rtype: int
        """
        if not matrix or not matrix[0]:
            return 0

        rows, cols = len(matrix), len(matrix[0])
        heights = [0] * (cols + 1)
        max_area = 0

        for row in matrix:
            for col in range(cols):
                heights[col] = heights[col] + 1 if row[col] == "1" else 0
            stack = [-1]  
            for i in range(cols + 1):
                while heights[i] < heights[stack[-1]]:
                    h = heights[stack.pop()]
                    w = i - stack[-1] - 1 
                    max_area = max(max_area, h * w)
                stack.append(i)

        return max_area
