class Solution {
    public int lengthOfLastWord(String s)
    {
        String[] ans=s.split("\\s+");
        int n=ans.length;
        int m=(ans[n-1].length());
        return m;
    }
}