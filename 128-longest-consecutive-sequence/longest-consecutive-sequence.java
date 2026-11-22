class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hash = new HashSet<>();
        
        int maxstreak =1;
        if(nums.length ==0)
        {
            return 0;
        }
        for(int value : nums)
        {
            hash.add(value);
        }
        for(int value : hash)
        {
            int current = value;
            int streak=1;
           
            if(!hash.contains(current-1))
            {
                 
                 while(hash.contains(current+1))
                 {
                    streak++;
                    current++;
                 }
                maxstreak = Math.max(maxstreak,streak);
            }
           
            
        }
        return maxstreak;
        
    }
}