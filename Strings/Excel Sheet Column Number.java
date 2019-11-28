class Solution {
    public int titleToNumber(String s) {
        if(s== null || s.length() == 0) return 0;
        
        int last = s.length()-1;
        int value = s.charAt(last) - 'A' + 1;        
        return 26*titleToNumber(s.substring(0,last))+value;
        
    }
}
