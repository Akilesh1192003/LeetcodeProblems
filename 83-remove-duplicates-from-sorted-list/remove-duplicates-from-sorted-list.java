class Solution
{
    public ListNode deleteDuplicates(ListNode head)
    {
         if (head == null || head.next == null) return head;
         ListNode temp=new ListNode(0);
         ListNode dummy=head;
         ListNode temp1=head.next;
         temp.next=head;
         while(temp1!=null)
         {
            if(dummy.val==temp1.val && temp1!=null)
            {
                if(temp1.next==null)
                {
                    dummy.next=null;
                    break;
                }
                else{
                temp1= temp1.next;
                }
            }
            else
            {
                 dummy.next=temp1;
                 dummy=dummy.next;
                 temp1=temp1.next;
            }
         }
        if(dummy!=null)
            {
               dummy.next=null;
            }
         return temp.next;
    }
}