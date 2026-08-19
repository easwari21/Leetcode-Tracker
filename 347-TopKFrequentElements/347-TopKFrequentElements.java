// Last updated: 8/19/2026, 10:39:25 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int idx=0;
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq= new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        pq.addAll(map.entrySet());
        for(int i=0;i<k;i++)
        {
           list.add(pq.poll().getKey());
        }
        int[] arr= new int[list.size()];
        for(int i=0;i<arr.length ; i++){
            arr[i]=list.get(i);
        }
        return arr;
        }
    }