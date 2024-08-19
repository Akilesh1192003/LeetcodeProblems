class Solution {
    public String mergeAlternately(String word1, String word2)
    {
        int i=word1.length();
        int j=word2.length();
        String ans="";
        int n=0;int m=0;
        while(n<i&&m<j)
        {
            ans=ans+ word1.charAt(n)+ word2.charAt(m);
            n++;
            m++;
        }
        while( n<i && (m)==j)
        {
            ans=ans+word1.charAt(n);
            n++;
        }
        while(m<j&& (n)==i)
        {
            ans=ans+word2.charAt(m);
            m++;
        }
        return ans;
    }
}