class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote == null) return true;
        if(magazine == null) return false;
        
        char [] counts  = new char [128];
        
        for(char c: magazine.toCharArray())
        {
            counts[c]++;
        }
        
        for(char c: ransomNote.toCharArray())
        {
            if(counts[c] <= 0)
                return false;
            else
                counts[c]--;
        }
        
        return true;
        
    }
}
