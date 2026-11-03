class Solution {
    public void rotate(int[][] matrix) {
    ArrayList<ArrayList<Integer>>result = new ArrayList<>();
      int top = 0;
      int bottom = matrix.length-1;
      int left = 0;
      int right = matrix[0].length-1;
      for(int i= left ;i<=right;i++)
      {
        ArrayList<Integer>row = new ArrayList<>();
        for(int j= bottom ;j>=top ;j--)
        {
                row.add(matrix[j][i]);
        }
        result.add(row);
      }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]= result.get(i).get(j);
            }
        }
            
      }



    }
        
    
