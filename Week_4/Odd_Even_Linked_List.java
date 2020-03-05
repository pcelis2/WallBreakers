
public class Odd_Even_Linked_List {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;
        ListNode oddHead = null;
        ListNode evenHead = null;
        ListNode oddCurrent = null;
        ListNode evenCurrent = null;
        ListNode current = head;
        int counter = 1;
        while (current != null) {
            // System.out.println("Current.val = " + current.val + "|| counter = "
            // +counter);
            if (counter % 2 == 0) {
                if (evenHead == null)
                    evenHead = new ListNode(current.val);
                if (evenCurrent == null)
                    evenCurrent = evenHead;
                else {
                    evenCurrent.next = new ListNode(current.val);
                    evenCurrent = evenCurrent.next;
                }
            } else {
                if (oddHead == null)
                    oddHead = new ListNode(current.val);
                if (oddCurrent == null)
                    oddCurrent = oddHead;
                else {
                    oddCurrent.next = new ListNode(current.val);
                    oddCurrent = oddCurrent.next;
                }
            }
            current = current.next;
            counter++;
        }
        // printNodes(oddHead);
        // printNodes(evenHead);
        oddCurrent.next = evenHead;
        return oddHead;
    }
}