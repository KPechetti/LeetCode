class Solution {
    public boolean isMatch(String s, String p) {
        
        char [] st = s.toCharArray();
        char [] pt = p.toCharArray();
        boolean T[][] = new boolean[s.length() + 1][p.length() + 1];
        T[0][0] = true;
        
        for (int i = 1; i < T[0].length; i++) {
            if (pt[i-1] == '*') {
                T[0][i] = T[0][i - 2];
            }
        }

        for (int i = 1; i < T.length; i++) {
            for (int j = 1; j < T[0].length; j++) {
                if (pt[j - 1] == '.' || pt[j - 1] == st[i - 1]) {
                    T[i][j] = T[i-1][j-1];
                } else if (pt[j - 1] == '*')  {
                    T[i][j] = T[i][j - 2];
                    if (pt[j-2] == '.' || pt[j - 2] == st[i - 1]) {
                        T[i][j] = T[i][j] || T[i - 1][j];
                    }
                } else {
                    T[i][j] = false;
                }
            }
        }
        return T[s.length()][p.length()];

    }
}
