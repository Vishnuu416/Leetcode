class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>answer = new ArrayList<>();
        int n= nums.length;
        if(n<3)
        {
            return answer;
        }
        Arrays.sort(nums);
        for(int fixed =0 ;fixed<n-2;fixed++ )
        {
            int left = fixed +1;
            int right = n-1;
            if(fixed>0 && nums[fixed]==nums[fixed-1])
            {
                continue;
            }
           
            while(left<right)
            {
                 long sum = (long)nums[fixed]+nums[left]+nums[right];
                if(sum>0)
                {
                    right--;
                }
                else if(sum<0)
                {
                    left++;
                }
                else
                {
                    answer.add(Arrays.asList(nums[left],nums[right],nums[fixed]));
                    
                
                left++;
                right--;
                
            

                while(left<right && nums[left]==nums[left-1])
                {
                    left++;
                }
                while(left<right && nums[right]==nums[right+1])
                {
                    right--;
                }
                }
            }
        }
        return answer;
        
    }
}