class Solution
{
    public int[][] generateMatrix(int n)
    {
        int mat[][]=new int[n][n];
        int m,i; 
        m = n;int a=1;
        int left=0,right=m-1 , top=0,bottom = n-1; 
        while(left<=right && top<=bottom)
        {
             for(i=left ; i<=right ; i++)
            {
             mat[top][i]=a;
             a++;
            }
         top++;
        for(i=top;i<=bottom;i++)
        {
         mat[i][right]=a;
         a++;
         }
         right--; 
       if(top<=bottom)
          for(i=right;i>=left;i--)
           {
              mat[bottom][i]=a;
              a++;
            }
        bottom--;  
        if(left<=right)
         for(i=bottom ; i>=top ; i--)
          {
            mat[i][left]=a;
            a++;
           }
          left++;

         } 
        return mat;
    }
}