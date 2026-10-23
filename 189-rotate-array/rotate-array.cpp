class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n= nums.size();
        if(nums.size()<k%nums.size())
        {
            return ;
        }
        reverse(nums.begin(),nums.end());
        reverse(nums.begin(),nums.begin()+k%nums.size());
        reverse(nums.begin()+k%nums.size(),nums.end());
        
    }
};