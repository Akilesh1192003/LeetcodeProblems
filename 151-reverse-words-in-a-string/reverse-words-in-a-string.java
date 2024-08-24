class Solution {
    public String reverseWords(String s)
    {s=s.stripLeading();
        String[] result=s.split("\\s+");
        int n=result.length;
        StringBuilder answer=new StringBuilder();
        for(int i=n-1;i>0;i--)
        {
            answer=answer.append(result[i]);
            answer=answer.append(" ");
        }
        answer=answer.append(result[0]);
        return answer.toString();
    }
}