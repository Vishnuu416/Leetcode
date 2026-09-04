class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        //int best=Integer.MIN_VALUE;
        int indx=0;
        for(int i=0;i<nums.length;i++)
        {
            int maxi=Integer.MIN_VALUE;
            int mini=Integer.MAX_VALUE;
            for(int j=0;j<=i;j++)
            {
                
                maxi=Math.max(nums[j],maxi);
            }
            for(int l=i;l<nums.length;l++)
            {
                
                mini=Math.min(nums[l],mini);
            }
        
        int diff=maxi-mini;
        if(diff<=k)
        {
            return i;
        }
       
        
      }
    return -1;
    }
    
    
}