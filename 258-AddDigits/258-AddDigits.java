// Last updated: 8/19/2026, 10:39:40 AM
class Solution {
    public int addDigits(int num) {
         if (num == 0) 
            return 0;
        if(num % 9 == 0)
            return 9;
     
        return (num % 9);
    }
}