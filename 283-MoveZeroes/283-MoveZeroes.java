// Last updated: 8/19/2026, 10:39:30 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int num : nums) {
        if (num != 0) {
        nums[insertPos++] = num;
        }
        }
        while (insertPos < nums.length) {
        nums[insertPos++] = 0;
        }
    }
}