// Last updated: 8/19/2026, 10:36:34 AM
class Solution {
    public double averageWaitingTime(int[][] customers) {
        long cur=0;
        long wait=0;
        for(int i=0;i<customers.length;i++){
            cur=Math.max(cur,customers[i][0]);
            cur+=customers[i][1];
            wait+=(cur-customers[i][0]);
        }
        return (double)wait/customers.length;
    }
}

