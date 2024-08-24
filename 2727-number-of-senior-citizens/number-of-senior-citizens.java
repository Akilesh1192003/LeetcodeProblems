class Solution
{
    public int countSeniors(String[] details)
    {
        int n=details.length;
        int m=0;
        for(int i=0;i<n;i++)
        {
            int a=details[i].charAt(11)-'0';
            int b=details[i].charAt(12)-'0';
            int c=a*10 + b;
            if(c>60)
            {
                m++;
            }
        }
        return m;
    }
}