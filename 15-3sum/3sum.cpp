class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        set<vector<int>>s; 
        for(int i=0;i<nums.size();i++)
        {
            int target= -nums[i];
            int n= nums.size();
            
            int left = i+1;
            int right = n-1;
            while(left<right)
            {
                int sum = nums[left] +nums[right];
                if(sum == target)
                {
                    s.insert({nums[i],nums[left], nums[right]});
                    left++;
                    right--;
                }
                else if(sum<target)
                {
                    left++;
                }
                else
                { 
                    right--;
                }
            }
        }
    
            vector<vector<int>> ans(s.begin(),s.end());
            return ans;

            }
};
            
           