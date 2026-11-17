class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer>result = new ArrayList<>();
        int n= nums.length;
        
       int threshold= nums.length/3;
       int candidate1=nums[0];
       int candidate2 = nums[0];
       int count1=0;
       int count2 =0;
       for(int value : nums)
       {
        if(candidate1==value)
        {
            count1++;
        }
        else if(candidate2==value)
        {
            count2++;
        }
        else if(count1==0)
        {
            candidate1 = value;
            count1=1;
        }
        else if(count2==0)
        {
            candidate2=value;
            count2=1;
        }
        else
        {
            count1--;
            count2--;
        }

       }
       int verification1=0;
       int verification2=0;
       for(int values : nums)
       {
        if(candidate1==values)
        {
            verification1++;
        }
        if(candidate2==values)
        {
            verification2++;
        }

       }
       if(verification1>n/3)
       {
        result.add(candidate1);
       }
       if (candidate1 != candidate2 && verification2>n/3)
       {
        result.add(candidate2);
       }
       return result;
    }
}