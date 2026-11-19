class Solution {
    public int reversePairs(int[] nums) {
        int arr[] = Arrays.copyOf(nums,nums.length);
        int n = arr.length;
        if(n<2)
        {
            return 0;
        }
        return mergesort(arr,0,n-1);
        
    }
    private int  mergesort(int[]arr,int left,int right)
    {
         int pairs=0;
        if(left>=right)
        {
            return 0;
        }
       
        int mid = left+(right-left)/2;
        pairs+=mergesort(arr,left,mid);
        pairs+=mergesort(arr,mid+1,right);
        pairs+=countpairs(arr,left,mid,right);
        merge(arr,left,mid,right);
        return pairs;

    }
    void merge(int[] arr,int left,int mid,int right)
    {
        int []merged = new int[right-left+1];
        int first = left;
        int second = mid+1;
        int k=0;
        while(first<=mid && second<=right)
        {
            if(arr[first]>arr[second])
            {
                merged[k++]=arr[second++];
            }
            else
            {
                merged[k++]= arr[first++];
            }
        }
            while(first<=mid)
            {
                merged[k++]=arr[first++];
            }
            while(second<=right)
            {
                merged[k++]=arr[second++];
            }
            for(int i=0;i<merged.length;i++)
            {
                arr[left+i]=merged[i];

            }
        }
        int countpairs(int[] arr, int left,int mid,int right)
        {
            int pairs=0;
            int rightpointer = mid+1;
            for(int i=left;i<=mid;i++)
            {
                long leftpointer = arr[i];
                while(rightpointer<=right && leftpointer > 2L*arr[rightpointer])
                {
                    rightpointer++;
                }
                 pairs += rightpointer-(mid+1);
            }
            return pairs;
        }
    }
