
class Solution {
    public List<Integer> LLTraversal(ListNode head) {
        //your code goes here

        List<Integer> result = new ArrayList<>();

        ListNode current = head;
        while(current != null)
        {
            result.add(current.data);
            current = current.next;
        }
        return result;

    }
}