# Last updated: 8/19/2026, 10:42:00 AM
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        INT_MAX = 2**31 - 1
        INT_MIN = -(2**31)

        if dividend == 0:
            return 0
        if dividend == INT_MIN and divisor == -1:
            return INT_MAX

        negative = (dividend > 0) != (divisor > 0)

        dividend = abs(dividend)
        divisor = abs(divisor)

        quotient = 0
        while dividend >= divisor:
            temp = divisor
            count = 1

            while dividend >= (temp << 1):
                count <<= 1
                temp <<= 1

            dividend -= temp
            quotient += count

        return -quotient if negative else quotient


                       