class Solution {
    public ListNode insertAtHead(ListNode head, int X) {
        //YOUR CODE GOES HERE

        ListNode newNode = new ListNode(X);
        newNode.next = head;

        return newNode;
    }
}

