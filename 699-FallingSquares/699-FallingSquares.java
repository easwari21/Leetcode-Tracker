// Last updated: 8/19/2026, 10:38:19 AM
class Solution {
    public List<Integer> fallingSquares(int[][] positions) {
        List<int[]> pro = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int max=0;
        for(int row[]:positions)
        {
            int left=row[0];
            int side = row[1];
            int right=left+side;
            int hei=side;
            for(int curr[]:pro)
            {
                int l=curr[0];
                int r=curr[1];
                int h= curr[2];
                if(Math.max(left,l)<Math.min(right,r))
                {
                    hei=Math.max(hei,h+side);
                }
            }
            pro.add(new int[] {left,right,hei});
            max = Math.max(max,hei);
            res.add(max);
        }
        return res;
    }
}