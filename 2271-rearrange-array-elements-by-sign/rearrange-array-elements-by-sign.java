class Solution 
{
    public int[] rearrangeArray(int[] nums) 
    {
        int j=0;
        int k=0;
        int[] pos = new int[nums.length];
        int[] neg = new int[nums.length];
        int[] res = new int[nums.length];
        ArrayList<Integer>result = new ArrayList<>(nums.length);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                pos[j++]=nums[i];
            }
            else
            {
                neg[k++]=nums[i];
            }
        }
        int p=k;
        int n=j;
         k=0;
         j=0;

        while(k<p && j<n)
        {
            result.add(pos[k]);
            result.add(neg[j]);
            k++;
            j++;
        }
        int i=0;
        for(int val : result)
        {
            res[i]=val;
            i++;
        }
        return res;
        }
        }

        
        
    
