// Last updated: 8/19/2026, 10:36:49 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty = numBottles;
        int total=numBottles;
        while(empty>=numExchange)
        {
           numBottles =empty/numExchange;
           total+=numBottles;
           empty=numBottles+(empty%numExchange);
        }
        return total;
    }
}