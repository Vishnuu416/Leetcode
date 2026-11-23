class Solution {
    public int subarraySum(int[] nums, int k) {
         HashMap<Long,Long>prefixcount = new HashMap<>();
        Long prefixsum =0L;
        int count =0;
         prefixcount.put(0L,1L);
        for(int i=0;i<nums.length;i++)
        {
            prefixsum+=nums[i];
            Long needed = prefixsum-k;
            if(prefixcount.containsKey(needed))
            {
                count += prefixcount.get(needed);
            }
            
            
                prefixcount.put(prefixsum,prefixcount.getOrDefault(prefixsum,0L)+1);
        }
            return count;
        }
        
    }

        
    