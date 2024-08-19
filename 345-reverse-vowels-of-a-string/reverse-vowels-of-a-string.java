class Solution {
    public boolean solve(char a)
    {
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
        {
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
       StringBuilder sb=new StringBuilder(s);
       int n=sb.length()-1;
       int i=0;
       while(i<n)
       {
        if(solve(sb.charAt(i))==true&&solve(sb.charAt(n))==true)
        {
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(n));
            sb.setCharAt(n,temp);
            i++;
            n--;
        }
        else if(solve(sb.charAt(i))==true&&solve(sb.charAt(n))==false)
        {
            n--;
        }
        else if(solve(sb.charAt(i))==false&&solve(sb.charAt(n))==true)
        {
            i++;
        }
        else{
            i++;
            n--;
        }
       }
       return sb.toString(); 
    }
}