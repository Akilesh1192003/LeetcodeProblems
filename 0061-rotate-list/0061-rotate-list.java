class Solution
{
    public ListNode rotateRight(ListNode head, int k)
    {
        if(head==null||head.next==null){return head;}
    ListNode p=head,q=null,current=head;
    int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
    for(int i=0;i<k%length;i++)
    {
        ListNode temp=p,r=p;
        while(temp.next.next!=null)
        {
            temp=temp.next;
            r=r.next;
        }
        temp=temp.next;
        r.next=q;
        temp.next=p;
        p=temp;
    }    
    return p;
    }
}