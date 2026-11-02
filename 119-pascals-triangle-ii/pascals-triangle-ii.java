class Solution {
    
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>>triangle = new ArrayList<>();
        for(int row =0;row<=rowIndex;row++)
        {
            List<Integer>result= new ArrayList<>();
            for(int col=0;col<=row;col++)
            {
                result.add(1);
            }
            for(int col=1;col<row;col++)
            {
                int val = triangle.get(row-1).get(col-1)+triangle.get(row-1).get(col);
                result.set(col,val);
            }
        
            triangle.add(result);
        }
        return triangle.get(rowIndex);

                
    }
}
