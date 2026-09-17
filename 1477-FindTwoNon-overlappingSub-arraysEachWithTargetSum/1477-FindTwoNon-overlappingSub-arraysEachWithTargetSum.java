// Last updated: 9/17/2026, 6:34:46 PM
1class Solution {
2    public int minSumOfLengths(int[] arr, int target) {
3        int n = arr.length;
4       int[] dp = new int[n];
5        Arrays.fill(dp, Integer.MAX_VALUE);
6        int left = 0;
7        int sum = 0;
8        int minlen = Integer.MAX_VALUE;
9        int ans = Integer.MAX_VALUE;
10        
11        for (int right = 0; right < n; right++) {
12            sum += arr[right];
13            while (sum > target && left <= right) {
14                sum -= arr[left];
15                left++;
16            }
17            if (sum == target) {
18                int currlen = right - left + 1;
19                if (left > 0 && dp[left - 1] != Integer.MAX_VALUE) {
20                    ans = Math.min(ans, currlen + dp[left - 1]);
21                }
22                
23                minlen = Math.min(minlen, currlen);
24            }
25            
26            
27            dp[right] = minlen;
28        }
29        
30        return ans == Integer.MAX_VALUE ? -1 : ans;
31    }
32}