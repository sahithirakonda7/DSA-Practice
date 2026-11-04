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
    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
        //YOUR CODE GOES HERE
        ListNode newNode = new ListNode(X);

        if(K==1)
        {
            newNode.next = head;
            return newNode;
        }
        ListNode temp = head;

        for(int i=1;i<K-1;i++)
        {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
        
    }
}

