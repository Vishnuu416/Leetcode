class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>hash=new HashMap<>();
        hash.put(0,-1);
        int max=0;
        int length =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                length +=-1;
            }
            else
            {
                length+=1;
            }
            if(hash.containsKey(length))
            {
                max= Math.max(max,i-hash.get(length));
            }
            else
            {
                hash.put(length,i);
            }
        } 
        return max;


        
    }
}