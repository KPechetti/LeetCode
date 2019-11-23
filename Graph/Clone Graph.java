/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
class Solution {
    public Node cloneGraph(Node node) {
        
        if(node == null) return node;
        Map<Node, Node> map = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        
        //Created new Nodes
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            
            if(!map.containsKey(temp))
            {
                
                Node cloneNode = new Node(temp.val, new ArrayList<Node>());
                
                map.put(temp,cloneNode);
                
                for(Node n: temp.neighbors)
                {
                    if(!map.containsKey(n))
                        q.add(n);
                }
            } 
        }
        
        
        //add neighbors to each node
        for(Node parent: map.keySet())
        {
            for(Node neig: parent.neighbors)
            {
                    map.get(parent).neighbors.add(map.get(neig));
            }
        }
        
        return map.get(node);
    }
}
