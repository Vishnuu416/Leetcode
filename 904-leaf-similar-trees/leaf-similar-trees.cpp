/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void inorder(TreeNode *root3,vector<int> &result)
    {
        if(root3==NULL)
        {
            return ;
        }
        if(root3->left==NULL && root3->right==NULL)
        {
            result.push_back(root3->val);
        }
        inorder(root3->left,result);
        inorder(root3->right,result);
        
    }
    bool leafSimilar(TreeNode* root1, TreeNode* root2) {

        vector<int>result1;
        vector<int>result2;
        inorder(root1,result1);
        inorder(root2,result2);
        //sort(result1.begin(),result1.end());
        //sort(result2.begin(),result2.end());
        if(result1==result2)
        {
            return true;
        }
        else 
            return false;

        
    }
};