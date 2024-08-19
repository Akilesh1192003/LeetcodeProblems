class Solution {
    public int lengthOfLastWord(String s)
    {
        s=s.trim();
        return s.length()-(int)(s.lastIndexOf(' '))-1;
    }
}