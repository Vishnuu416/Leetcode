class Solution {
    /// this involves some mathematical operation kust trace this code on chatgpt once then try to understsand this code !!
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        long expectedsum =(long) n*(n+1)/2;
        long actualsum =0;
        for(int i=0;i<nums.length;i++)
        {
            actualsum+=nums[i];
        }
        long diff =expectedsum-actualsum;
        long esquaresum =(long)n*(n+1)*(2*n+1)/6;
        long asquaresum=0;
        for(int i=0;i<nums.length;i++)
        {
            asquaresum +=(long)nums[i]*nums[i];
        }
        long squarediff = esquaresum-asquaresum;
        long sum = squarediff/diff;
        int missing = (int)((sum+diff)/2);
        int repeating = (int)(missing - diff);
        return new int[]{repeating,missing};
    }
}