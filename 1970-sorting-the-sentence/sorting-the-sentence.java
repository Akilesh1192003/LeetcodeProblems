class Solution
{
    public String sortSentence(String s)
    {
     String str[]=s.split("\\s+");
     StringBuilder sb=new StringBuilder();
     int j=0;
     String res[]=new String[str.length];
     for(int i=0;i<str.length;i++)
     {
        String st=str[i];
         j=(int)st.charAt((st.length()-1))-'0';
         res[j-1]=st.substring(0,st.length()-1);
     }
     for(int i=0;i<res.length-1;i++)
     {
        sb.append(res[i]).append(" ");
     }
     sb.append(res[res.length-1]);
     String sd=sb.toString();
     return sd;
    }
}