class Solution {
public:
    bool isValid(string s) {
        stack<char>st;
        
        for(auto it : s)
        {
            if(it=='('||it=='{'||it=='[')
            {
                st.push(it);
            }
            else
            {
            char c = st.top();
            
            
                if(st.empty())
                {
                 return false;
                }
                if((c=='{'&& it=='}') ||(c=='('&& it==')')|| (c =='[' && it ==']'))
                {
                    st.pop();
                }
                else
                    return false;
                
            }
        }
        if(st.empty())
        {
            return true;
        }
        return false;
        
    }
};