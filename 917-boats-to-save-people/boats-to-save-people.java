class Solution {
    public int numRescueBoats(int[] people, int limit)
    {
        int n=people.length;
     Arrays.sort(people);
     int c=0;
     int l=0;
     int r=n-1;
     while(l<=r)
     {
        if((people[l]+people[r])<=limit)
        {
            l++;
            r--;
            c++;
        }
        else{
            r--;
            c++;
        }
     }
     return c;
    }
}