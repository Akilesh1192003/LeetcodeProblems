class Solution
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
     if(list1==null&&list2==null)
     {
        return null;
     }   
    if(list1!=null&&list2==null)
     {
        return list1;
     } 
     if(list1==null&&list2!=null)
     {
        return list2;
     } 
     ListNode temp;
     ListNode head;
     if(list1.val<list2.val)
     {
        temp=list1;
        head=temp;
        list1=list1.next;
     } 
     else
     {
        temp=list2;
        head=temp;
        list2=list2.next;
     } 
     while(list1!=null && list2!=null)
     {
         if(list1.val<list2.val)
       {
        temp.next=list1;
        list1=list1.next;
        temp=temp.next;
        } 
        if(list1.val>=list2.val)
       {
       temp.next=list2;
        list2=list2.next;
        temp=temp.next;
       } 
     }
     if(list1!=null)
     {
        temp.next=list1;
     }
     if(list2!=null)
     {
        temp.next=list2;
     }
     return head;
    }
}