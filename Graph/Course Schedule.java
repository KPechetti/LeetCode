class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       Map<Integer, List<Integer>> map = new HashMap<>();
        
        for(int[] arr : prerequisites)
        {
            if(map.containsKey(arr[0]))
            {
                map.get(arr[0]).add(arr[1]);                
            }
            else
            {
                List<Integer> l = new ArrayList<>();
                l.add(arr[1]); 
                map.put(arr[0], l);
            }
        }
        
        boolean visited [] = new boolean[numCourses];
        boolean recStack [] = new boolean[numCourses];
        
        for(int i =0; i<numCourses ; i++){
            
            if(isCyclic(i, visited, recStack, map))
                return false;
        }
        
        return true;       
    }
    
    public boolean isCyclic(int v, boolean[] visited, boolean[] recStack, Map<Integer, List<Integer>> map)
    {
        if(recStack[v]) return true;
        if(visited[v]) return false;
        
        recStack[v] = true;
        visited[v] = true;
        
        for(int i =0; i<map.getOrDefault(v, new ArrayList<>()).size(); i++)
        {
            if(isCyclic(map.get(v).get(i),visited, recStack, map))
                return true;
        }
        recStack[v] = false;
        
        return false;
    }
}
