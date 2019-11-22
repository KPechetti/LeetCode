class Solution {
    public String removeDuplicates(String S) {
        
        if(S == null || S.length() == 0) return "";        
        Stack<Character> st = new Stack<>();   
        for(char c: S.toCharArray())
        {
            if(!st.isEmpty() && st.peek() == c)
                st.pop();
            else
                st.push(c);     
        }        
        String res = "";
        while(!st.isEmpty())
        {
            res = st.pop()+res;
        }
        
        return res;
    }
}
