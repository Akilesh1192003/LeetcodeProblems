class Solution {
    public String mergeAlternately(String word1, String word2)
    {
        int i=word1.length();
        int j=word2.length();
        StringBuilder ans=new StringBuilder();
        int n=0;int m=0;
        while(n<i&&m<j)
        {
            ans.append(word1.charAt(n));
            ans.append(word2.charAt(m));
            n++;
            m++;
        }
        while( n<i && (m)==j)
        {
            ans.append(word1.charAt(n));
            n++;
        }
        while(m<j&& (n)==i)
        {
            ans.append(word2.charAt(m));
            m++;
        }
        return ans.toString();
    }
}