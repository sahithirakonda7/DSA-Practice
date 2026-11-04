class Solution {
    public ListNode deleteTail(ListNode head) {
        //your code goes here

        if(head==null || head.next==null)
        {
            return null;
        }
        ListNode current = head;

        while(current.next.next!=null)
        {
            current = current.next;
        }
        current.next = null;
        return head;
    }
}

