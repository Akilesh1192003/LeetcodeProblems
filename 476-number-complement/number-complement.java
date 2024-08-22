class Solution {
    public int findComplement(int num) {
        int merge=1;
        int temp=num;
        while(temp>0)
        {
            num=num^merge;
            merge=merge<<1;
            temp=temp>>1;
        }
        return num;
    }
}