// Last updated: 8/19/2026, 10:38:40 AM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int m = nums1.length, n = nums2.length;
        Map<Integer, Integer> map = new HashMap(n);
        for(int i:nums2)
        {
            while(!st.isEmpty() && i>st.peek())
                map.put(st.pop(),i);
            st.push(i);
        }
        while(!st.isEmpty())
            map.put(st.pop(),-1);
        int[] ans = new int[m];
        for (int i = 0; i < m; ++i) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }
        return ans;
    }
}