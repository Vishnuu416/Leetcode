class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l=0;
        int r=0;
        int maxlen =0;
        int len =0;
        int[] hash = new int[256];
        for(int i=0;i<255;i++)
        {
            hash[i]=-1;
        }
        while(r<n)
        {
            if(hash[s.charAt(r)]!=-1)
            {
                if(hash[s.charAt(r)]>=l)
                {
                    l= hash[s.charAt(r)]+1;
                }
            }
                len = r-l+1;
                maxlen = Math.max(maxlen,len);
                hash[s.charAt(r)]=r;
                r= r+1;
            }
        
        return maxlen;
        
    }
}