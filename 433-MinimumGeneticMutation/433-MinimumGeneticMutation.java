// Last updated: 8/19/2026, 10:38:58 AM
class Solution 
{
    public boolean isvalid(String a,String b)
    {
        int d=0;
        for(int i=0;i<8;i++)
        {
            if(a.charAt(i)!=b.charAt(i))
            {
                d++;
                if(d>1)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public int minMutation(String sg, String eg, String[] bank) {
        Queue<String> pq=new ArrayDeque<>();
        boolean[] v = new boolean[bank.length];
        pq.offer(sg);
        int steps=0;
        while(!pq.isEmpty())
        {
            for(int j=pq.size();j>0;j--)
            {
                String cur=pq.poll();
                if(cur.equals(eg)) return steps;
                for(int i=0;i<bank.length;i++)
                {
                    if(!v[i]&& isvalid(cur,bank[i]))
                    {
                        v[i]=true;
                        pq.offer(bank[i]);
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}