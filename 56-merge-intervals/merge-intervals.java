class Solution {
    public int[][] merge(int[][] intervals) {
        //int[][]result =new int[intervals[0].length][];
        ArrayList<int[]>merge = new ArrayList<>();
        int currentinterval=0;
        int nextinterval =0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for(int i=0;i<intervals.length;i++)
        {
            if(merge.isEmpty())
            {
                merge.add(intervals[i]);
            }
            int[] last = merge.get(merge.size()-1);
            currentinterval= last[1];
            
                nextinterval = intervals[i][0];
                if(currentinterval>=nextinterval)
                {
                    last[1]= Math.max(last[1],intervals[i][1]);
                }
                else
                {
                    merge.add(intervals[i]);
                }
                   
                    
                
        }

        
        int[][]result = merge.toArray(new int[merge.size()][]);
        return result;
}
        
    }
