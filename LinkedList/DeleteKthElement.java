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
    public ListNode deleteKthNode(ListNode head, int k) {
        // Your code goes here

        if(k==1)
        {
            return head.next;
        }

        ListNode temp = head;

        for(int i=1;i<k-1;i++)
        {
            temp = temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}

