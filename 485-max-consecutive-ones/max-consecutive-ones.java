class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int streak=0;
        int maxi=0;
       
        for(int num : nums)
        {
            if(num==1)
            {
                streak++;
                maxi = Math.max(streak,maxi);
            }
            else
            {
                streak=0;

            }
        }
        
        return maxi;

        
    }
}