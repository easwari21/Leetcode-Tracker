// Last updated: 8/19/2026, 10:40:03 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> index = new HashSet<>();
        for(int i : nums)
        {
            if(index.contains(i))
            {
                return true;
            }
            index.add(i);
        }
        return false;
    }
}