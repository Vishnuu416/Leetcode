class Solution {
    public int[] productExceptSelf(int[] nums) {
     int[] result =new int[nums.length];
     int prefix =1;
     int sufix=1;
     for(int i=0;i<nums.length;i++)
     {
        result[i]=prefix;
        prefix*=nums[i];
     }
     for(int j=nums.length-1;j>=0;j--)
     {
        result[j]*=sufix;
        sufix*=nums[j];
     }
     return result;
    }
}