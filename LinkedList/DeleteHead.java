class Solution {
    public ListNode deleteHead(ListNode head) {
        //your code goes here
        if (head==null || head.next ==  null)
        {
            return null;
        }
        head = head.next;
        return head;

    }
}

