class Solution {
    public boolean isMatch(String s, String p) {
        
        int sl = s.length(), pl = p.length();
        
        boolean dp [][] = new boolean [sl+1][pl+1];
        dp[sl][pl] = true;
        
        for(int i = sl; i>=0; i--)
        {
            for(int j = pl-1; j>=0; j--)
            {
                if(p.charAt(j) == '*')
                {
                    if(i<sl)
                        dp[i][j] = dp[i][j+1] || dp[i+1][j] ||dp[i+1][j+1];
                    else
                        dp[i][j] = dp[i][j+1];                
                }
                else if( i < sl && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i)))
                {
                    dp[i][j] = dp[i+1][j+1];
                }
            }
        }
        
        return dp[0][0];
        
        
    }
}
