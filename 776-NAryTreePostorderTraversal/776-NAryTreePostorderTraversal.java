// Last updated: 8/19/2026, 10:38:08 AM
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        if(root==null)return new ArrayList<>();  
        List<Integer> res= new ArrayList<>();  
        process(root,res);
        return res;
    }
    public static void process(Node root,List<Integer> res)
    {
        if(root==null)
        return;
        for(Node temp:root.children)
        process(temp,res);
        res.add(root.val);
    }
}