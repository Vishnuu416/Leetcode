class Solution {
    public int swap(int []nums,int l,int r)
    {
        int temp =nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        return temp;
    }
    public void moveZeroes(int[] nums) {
        int l=0;
        int r=0;
        while(r!=nums.length)
        {
            if(nums[r]!=0)
            {
                swap(nums,l,r);
                l++;
            }
            r++;
        }
    }
}