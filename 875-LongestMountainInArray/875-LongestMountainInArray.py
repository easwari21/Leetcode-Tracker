# Last updated: 8/19/2026, 10:38:03 AM
class Solution:
    def longestMountain(self, arr: List[int]) -> int:
        c=0
        if len(arr)<3:
            return 0
        for i in range(1,len(arr)-1):
            if arr[i-1]<arr[i]>arr[i+1] :
                r = i+1
                l = i-1
                while r + 1 < len(arr) and arr[r]>arr[r+1]:
                    r+=1
                while l - 1 >= 0 and arr[l-1]<arr[l]:
                    l-=1
                c = max(c,r-l+1)
        return c