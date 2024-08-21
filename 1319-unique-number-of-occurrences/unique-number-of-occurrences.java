class Solution
{
    public boolean uniqueOccurrences(int[] arr)
    {
        Arrays.sort(arr);
        int n=arr.length;
       List<Integer> list=new ArrayList<>();
       for(int i=0;i<n;i++)
       { int count=0;
        for(int j=i;j<n;j++)
        {
            if(arr[j]==arr[i])
            {
             count++;
            }
           if(arr[i]!=arr[j])
            {
                i=j-1;
                break;
            }
             if(j==(n-1))
             {
                i=j;
             }
          }
          if(list.contains(count))
          {
            return false;
            }
          else
          {
            list.add(count);
            }
       }
     return true;
    }
}