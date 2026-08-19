# Last updated: 8/19/2026, 10:39:46 AM
class Solution(object):
    def countDigitOne(self, n):
        count = 0
        i = 1  
        
        while i <= n:
            high = n // (i * 10)
            current = (n // i) % 10
            low = n % i
            
            if current == 0:
                count += high * i
            elif current == 1:
                count += high * i + low + 1
            else:
                count += (high + 1) * i
            
            i *= 10  
            
        return count