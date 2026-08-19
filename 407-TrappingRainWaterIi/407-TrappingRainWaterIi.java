// Last updated: 8/19/2026, 10:39:09 AM
class Solution {
    public int trapRainWater(int[][] map) {
        int n=map.length;
        int m=map[0].length;
        if(n<3 || m<3)
        return 0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        boolean visit[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            pq.offer(new int[]{map[i][0],i,0});
            pq.offer(new int[]{map[i][m-1],i,m-1});
            visit[i][0]=true;
            visit[i][m-1]=true;
        }
          for(int i=0;i<m;i++)
        {
            pq.offer(new int[]{map[0][i],0,i});
            pq.offer(new int[]{map[n-1][i],n-1,i});
            visit[0][i]=true;
            visit[n-1][i]=true;
        }
        int dir[][]={{0,1},{1,0},{0,-1},{-1,0}};
        int res=0;
        while(!pq.isEmpty())
        {
            int[] curr=pq.poll();
            int hei=curr[0];
            int x=curr[1];
            int y=curr[2];
            for(int[] d:dir){
                int dx=x+d[0];
                int dy=y+d[1];
                if(dx>=0 && dy>=0 && dx<n && dy<m && !visit[dx][dy]){
                    res+=Math.max(0,hei-map[dx][dy]);
                    pq.offer(new int[]{Math.max(hei,map[dx][dy]),dx,dy});
                    visit[dx][dy]=true;
                }
            }
        }
        return res;
    }
}