public class Reverse_Linked_List_II {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode mthNode = null;
        ListNode myHead = mthNode;
        ListNode current = head;
        for (int i = 1; i < m; i++) {
            if (mthNode == null) {

                mthNode = new ListNode(current.val);
                myHead = mthNode;
            } else {
                mthNode.next = new ListNode(current.val);
            }
            current = current.next;
        }
        ListNode reversed = null;
        if (current != null)
            reversed = reverseFromHeadForNTimes(current, n - m);
        if (myHead == null) {
            myHead = reversed;
        } else {
            mthNode.next = reversed;
        }
        return myHead;
    }

    public ListNode reverseFromHeadForNTimes(ListNode head, int n) {
        ListNode current = head;
        ListNode previous = null;
        ListNode holderForCurrent = head;
        for (int i = 0; i <= n && holderForCurrent != null; i++) {
            holderForCurrent = holderForCurrent.next;
            current.next = previous;
            previous = current;
            current = holderForCurrent;
        }
        if (previous != null)
            head.next = current;
        return previous;
    }

}