import java.util.*;

public class Top_K_Frequent_Elements {
    public static void main(String[] args) {

    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> idAndOccureHashMap = new HashMap<Integer, Integer>();
        for (Integer I : nums) {
            Integer value = idAndOccureHashMap.get(I);
            if (value == null) {
                idAndOccureHashMap.put(I, 1);
            } else {
                idAndOccureHashMap.replace(I, value, value + 1);
            }
        }
        class Pair implements Comparable<Pair> {
            int key;
            int value;

            Pair(int k, int v) {
                key = k;
                value = v;
            }

            @Override
            public int compareTo(Pair o) {
                if (this.value > o.value)
                    return 1;
                else if (this.value < o.value)
                    return -1;
                else
                    return 1;
            }

        }
        PriorityQueue<Pair> kFrequency = new PriorityQueue<Pair>();
        for (Map.Entry<Integer, Integer> entry : idAndOccureHashMap.entrySet()) {
            kFrequency.add(new Pair(entry.getKey(), entry.getValue()));
        }
        List<Integer> mySolution = new LinkedList<Integer>();
        for (int i = 0; i < k; i++) {
            mySolution.add(kFrequency.remove().key);
        }
        return mySolution;
    }
}