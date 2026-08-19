// Last updated: 8/19/2026, 10:38:00 AM
class Solution {
    public int kSimilarity(String s1, String s2) {
        Queue<String> que = new LinkedList<>();
        Set<String> set = new HashSet<>();
        que.offer(s1);
        set.add(s1);
        int c=0;
        while(!que.isEmpty())
        {
            int size = que.size();
            while(size-- >0)
            {
                String curr = que.poll();
                if(curr.equals(s2))
                return c;
                int i=0;
                while(curr.charAt(i)==s2.charAt(i))
                i++;
                for(int j=i+1;j<curr.length();j++)
                {
                    if(curr.charAt(j)==s2.charAt(i) && curr.charAt(j)!=s2.charAt(j))
                    {
                        String str=swap(curr,i,j);
                        if(!set.contains(str))
                        {
                            que.offer(str);
                            set.add(str);
                        }
                    }
                }
            }
            c++;
        }
        return c;
    }
    public static String swap(String s,int i,int j)
    {
        char ch[] = s.toCharArray();
        char c = ch[i];
        ch[i]=ch[j];
        ch[j]=c;
        return new String(ch);
    }
}