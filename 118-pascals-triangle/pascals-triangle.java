class Solution {
    public List<List<Integer>> generate(int numRows) {
       
        List<List<Integer>>triangle = new ArrayList<>();
        for(int row=0;row<numRows;row++)
        {
            ArrayList<Integer>result = new ArrayList<>();
            for(int col=0;col<=row;col++)
            {
                result.add(1);
            }
            for(int col =1;col<row;col++)
            {
                int val =triangle.get(row-1).get(col-1)+triangle.get(row-1).get(col);
                result.set(col,val);
            }
            triangle.add(result);
        }
        return triangle;
    }
}