import java.util.*;

public class Next_Greater_Element_I {
    public static void main(String[] args) {

    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Couldn't solve with a stack :(

        int[] mySolution = new int[nums1.length];
        if (nums2.length == 0) {
            for (int i = 0; i < nums1.length; i++)
                nums1[i] = -1;
            return mySolution;
        }

        HashMap<Integer, Integer> numberAndIndex = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums2.length; i++) {
            numberAndIndex.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            int value = nums1[i];
            mySolution[i] = -1;
            boolean done = false;
            int pointer = numberAndIndex.get(nums1[i]) + 1;
            while (pointer < nums2.length && !done) {
                if (nums2[pointer] > value) {
                    mySolution[i] = nums2[pointer];
                    done = true;
                } else {
                    pointer++;
                }
            }
        }
        return mySolution;

    }
}