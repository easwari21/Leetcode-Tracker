// Last updated: 8/19/2026, 10:36:33 AM
class Solution {
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int arr[][] = new int[n][3];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=tasks[i][0];//arrival time
            arr[i][1]=tasks[i][1];//processing time
            arr[i][2]=i;//process index
        }
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1]) return a[1]-b[1];
            //if process time not is equal then it returns first one
            return a[2]-b[2];//else returns smallest index of equal processing time values
        });
        int time=0,idx=0,residx=0;
        int[] res = new int[n];
        while(residx<n)
        {
            while(idx<n && time>=arr[idx][0])
            {
                pq.offer(arr[idx]);
                idx++;
            }
            if(pq.isEmpty())
            {
                time=arr[idx][0];
            }
            else
            {
                int curr[] = pq.poll();
                time=time+curr[1];
                res[residx]=curr[2];
                residx++;
            }
        }
        return res;
    }
}