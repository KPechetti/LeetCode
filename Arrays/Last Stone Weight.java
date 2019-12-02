class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        
        for(int n: stones)
        {
            pq.add(n);
        }
        
        while(pq.size() >=2)
        {
            int x = pq.poll();
            int y = pq.poll();
            
            if(x!=y)
            {
                pq.add(Math.abs(x-y));
            }
        }
        
        return pq.isEmpty()?0: pq.poll();
        
    }
}
