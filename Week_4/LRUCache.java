import java.util.*;

public class LRUCache {

    public static void main(String[] args) {
        // ["LRUCache","put","put","get","put","get","put","get","get","get"]
        // [[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]
        LRUCache myCache = new LRUCache(2);
        myCache.put(1, 1);
        myCache.put(2, 2);
        myCache.get(1);
        myCache.put(3, 3);
        myCache.get(2);
        myCache.put(4, 4);
        myCache.get(1);
        myCache.get(3);
        myCache.get(4);
    }

    int size;
    int capacity;
    HashMap<Integer, Integer> numbersInHashMap;
    LinkedList<Integer> numbersInLinkedList;

    public LRUCache(int cap) {
        capacity = cap;
        size = 0;

        numbersInHashMap = new HashMap<Integer, Integer>();
        numbersInLinkedList = new LinkedList<Integer>();
    }

    public int get(int key) {
        Integer value = numbersInHashMap.get(key);
        if (value == null)
            return -1;
        else {

            numbersInLinkedList.remove((Object) key);
            numbersInLinkedList.addFirst(key);
            return value;
        }
    }

    public void put(int key, int value) {
        if (numbersInHashMap.containsKey(key)) {
            numbersInLinkedList.remove((Object) key);
            numbersInLinkedList.addFirst(key);
            numbersInHashMap.replace(key, value);
        } else {
            if (capacity == size) {
                int toRemove = numbersInLinkedList.removeLast();
                numbersInHashMap.remove(toRemove);
                numbersInHashMap.put(key, value);
                numbersInLinkedList.addFirst(key);
            } else {
                size++;
                numbersInHashMap.put(key, value);
                numbersInLinkedList.addFirst(key);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such: LRUCache obj =
 * new LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
 */
