
class Solution {
    public ListNode insertAtTail(ListNode head, int X) {
        //YOUR CODE GOES HERE

        ListNode newNode = new ListNode(X);
        if(head ==  null)
        {
            return newNode;
        }
        ListNode current = head;
        while(current.next != null)
        {
            current=current.next;
        }
        current.next = newNode;
        return head;
    }
}
