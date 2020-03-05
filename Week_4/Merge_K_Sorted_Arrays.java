import java.util.*;

public class Merge_K_Sorted_Arrays {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        PriorityQueue<ListNode> myHeapOfList = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val < o2.val)
                    return -1;
                else if (o1.val > o2.val)
                    return 1;
                else
                    return 0;
            }
        });
        for (ListNode node : lists) {
            if (node != null)
                myHeapOfList.add(node);
        }
        ListNode head = null;
        if (myHeapOfList.isEmpty())
            return head;
        ListNode current = myHeapOfList.remove();
        head = new ListNode(current.val);
        current = current.next;
        if (current != null) {
            myHeapOfList.add(current);
        }
        current = head;
        ListNode topMostList = null;
        while (!myHeapOfList.isEmpty()) {
            topMostList = myHeapOfList.remove();
            current.next = new ListNode(topMostList.val);
            current = current.next;
            topMostList = topMostList.next;
            if (topMostList != null)
                myHeapOfList.add(topMostList);
        }

        return head;
    }
}