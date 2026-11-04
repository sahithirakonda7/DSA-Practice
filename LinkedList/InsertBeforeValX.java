/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public ListNode insertBeforeX(ListNode head, int X, int val) {
        //YOUR CODE GOES HERE

        ListNode newNode = new ListNode(val);
        if(head.data==X)
        {
            newNode.next = head;
            return newNode;
        }

        ListNode temp = head;

        while(temp.next!=null&&temp.next.data!=X)
        {
            temp = temp.next;

        }

        if(temp.next!=null)
        {
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }
}

