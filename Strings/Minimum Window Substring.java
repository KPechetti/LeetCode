class Solution {
    public String minWindow(String s, String t) {
        if(s == null || t== null)return "";
        
        String res = "";
        int left = 0, count =0, max = Integer.MAX_VALUE;
        int [] ch = new int [128];
        
        for(char c: t.toCharArray())
            ++ch[c];
        
        for(int r =0; r<s.length(); r++)
        {
            if(--ch[s.charAt(r)] >= 0)
                count++;
            
            while(count == t.length())
            {
                if(max > r-left+1)
                {
                    max = r-left+1;
                    res = s.substring(left,r+1);
                }
                
                if(++ch[s.charAt(left)] > 0)
                    count--;
                left++;                
            }
        }
        
        return res;
        
    }
}
