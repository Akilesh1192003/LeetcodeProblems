class Solution
{
    public boolean canPlaceFlowers(int[] flowerbed, int n)
    {    int length=flowerbed.length;
        int allocation=0;
        if(n==0)
        {
            return true;
        }
        if(length==1)
        {
            if(flowerbed[0]==0 && n==1)
            {return true;}
            else{
                return false;
            }
        }
        if(flowerbed[0]==0 && flowerbed[1]==0)
        {
            flowerbed[0]=1;
            allocation++;
             if(allocation>=n)
            {
            return true;
            }
        }
        if(flowerbed[length-1]==0 && flowerbed[length-2]==0)
        {
            flowerbed[length-1]=1;
            allocation++;
             if(allocation>=n)
         {
            return true;
         }
        }
        for (int i = 1; i < length-1; i++)
        {
            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0)
            {
                flowerbed[i]=1;
                allocation++;
            }
             if(allocation>=n)
            {
            return true;
            }
        }
       
        return false;
    }
}