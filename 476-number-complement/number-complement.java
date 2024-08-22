class Solution {
    public int findComplement(int num) {
        int temp=num;
        int merge=1;
        while(temp!=0)
        {
            num=(num^merge);
            temp=temp>>1;
            merge=merge<<1;
        }
        return num;
    }
}