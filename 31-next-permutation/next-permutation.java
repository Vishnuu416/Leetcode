class Solution {
    public int swap (int num[] , int i , int j)
    {
        int temp;
        temp = num[i];
        num[i]=num[j];
        num[j]= temp;
        return temp;

    }
    public void reverseindex(int nums[],int start)
    {
        int end = nums.length-1;
        while(start<end)
        {
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int breakpoint =-1;
        int swapelement =-1;
        for(int i= nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                breakpoint = i;
                break;
            }
        }
        if(breakpoint == -1)
        {
            reverseindex(nums,0);
            return;
        }
        for(int i= nums.length-1;i>=0;i--)
        {
            if(nums[breakpoint] <nums[i])
            {
                swapelement = i;
                break;
            }
        }
        swap(nums,breakpoint,swapelement);
        reverseindex(nums,breakpoint+1);
        

        
    }
}