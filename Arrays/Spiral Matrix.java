class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ls = new ArrayList<>();
        
        if(matrix.length == 0) return ls;
        
        int r =0, c =0,i;
        
        int rows = matrix.length, col = matrix[0].length;
        
        while(r <rows && c < col)
        {
            for(i=c; i<col; i++)
            {
                ls.add(matrix[r][i]);
            }
            r++;
            
            for(i =r; i< rows; i++ )
            {
                ls.add(matrix[i][col-1]);
            }
            col--;
            
            if(r < rows)
            {
                for(i = col-1; i >= c; i--)
                {
                    ls.add(matrix[rows-1][i]);
                }
                rows--;
            }
            if(c < col)
            {
                for(i =rows-1; i>=r; i--)
                {
                    ls.add(matrix[i][c]);
                }
                c++;
            }
        }
        
        return ls;
       
        
    }
}
