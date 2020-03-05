public class Reverse_Linked_List {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode placeHolder = current;
        while (current != null) {
            placeHolder = placeHolder.next;
            current.next = previous;
            previous = current;
            current = placeHolder;

        }
        return previous;
    }
}