class Solution {
    public void setZeroes(int[][] matrix) {
        
        //ArrayList<Integer>row = new ArrayList<>();
        //ArrayList<Integer>column = new ArrayList<>();
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                   // row.add(i);
                    //column.add(j);
                    row[i]= true;
                    column[j]= true;
                    
                }
            }
        }
        for(int i=0 ;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(row[i] || column[j])
                {
                    matrix[i][j]=0;
                }
                
            }
        }
    }
}