class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum =0;
        int n=x;
        int digit =0;
        while(n>0)
        {   digit=n%10;
            sum +=digit;
            n = n/10;
        }
        if(x%sum==0)
        {
            return sum;
        }
        else
            return -1;
        
    }
}