class Solution {
    public boolean isSubsequence(String st, String t)
    {
        char [] a=st.toCharArray();
        char [] b=t.toCharArray();
        int n=a.length;
        int m=b.length;int j=0;int s=0;
        for(int i=0;i<n;i++)
        {
            while(j<m)
            {
              if(a[i]==b[j])
              {j++;
              s++;
                break;
              }
              else{
              }
              j++;
            }
        }
        if(s==n)
        {
            return true;
        }
        return false;
    }
}