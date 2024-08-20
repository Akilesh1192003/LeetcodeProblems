class Solution
{
    public ListNode swapPairs(ListNode head)
    { if (head == null || head.next == null) return head;
        ListNode temp=new ListNode(0);
        ListNode trail=temp;
        ListNode curr=head;
        while(curr!=null && curr.next!=null)
        {
            ListNode np=curr.next.next;
              trail.next=curr.next;
            curr.next.next=curr;
            curr.next=np;
            trail=curr;
            curr=np;
        }
        return temp.next;
    }
}