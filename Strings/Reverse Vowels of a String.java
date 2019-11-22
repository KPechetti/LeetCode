class Solution {
    public String reverseVowels(String s) {
        Set<Character> st = new HashSet<>();
        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');
        st.add('u');
        st.add('A');
        st.add('E');
        st.add('I');
        st.add('O');
        st.add('U');
        char [] ch = new char[s.length()];
        for(int i =0; i<s.length(); i++)
            ch[i] = s.charAt(i);
        
        int l = 0, r = s.length()-1;
        
        while(l<r)
        {
            char c1 = ch[l];
            char c2 = ch[r];
            
            if(st.contains(c1) && st.contains(c2))
            {
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;                
                l++; r--;
            }
            else if(st.contains(c1))
                r--;
            else if(st.contains(c2))
                l++;
            else
            {
                l++; r--;
            }
        }
        
        return new String(ch);
    }
}
