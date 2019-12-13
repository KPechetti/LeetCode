class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> ls = new ArrayList<String>();
        for(String str: A.split(" "))
        {
            map.put(str, map.getOrDefault(str,0)+1);
        }
        
        for(String str: B.split(" "))
        {
            map.put(str, map.getOrDefault(str,0)+1);        
        }
        
        for(String str: map.keySet())
        {
            if(map.get(str) == 1)
                ls.add(str);
        }
       
        return ls.toArray(new String[ls.size()]);
       
    }
}
