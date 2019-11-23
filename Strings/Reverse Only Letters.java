class Solution {
    public String reverseOnlyLetters(String S) {
        char [] ch = S.toCharArray();
        int l = 0 , r = ch.length-1;
        
        while(l<r)
        {
            if(Character.isLetter(ch[l]) && Character.isLetter(ch[r]))
            {
                char c = ch[l];
                ch[l] = ch[r];
                ch[r] = c;
                l++; r--;
            }
            else if(Character.isLetter(ch[l]))
                r--;
            else if(Character.isLetter(ch[r]))
                l++;
            else
            {
                r--; l++;
            }
        }
        
        return new String(ch);
    }
}
