# Last updated: 8/19/2026, 10:41:23 AM
class Solution:
    def merge(self, intervals):
        """
        Merges overlapping intervals in a list of intervals.
        Args:
            intervals: A list of intervals, where each interval is a list of two integers [start, end].
        Returns:
            A list of non-overlapping intervals.
        """
        intervals.sort(key=lambda x: x[0])  
        merged = []
        start, end = intervals[0]

        for i in range(1, len(intervals)):
            interval_start, interval_end = intervals[i]
            if interval_start <= end:  
                end = max(end, interval_end)
            else:  
                merged.append([start, end])
                start, end = interval_start, interval_end
        merged.append([start, end])

        return merged