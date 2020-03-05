
import java.util.LinkedList;
import java.util.Queue;

public class Rotate_Array {
    public static void main(String[] args) {

    }

    public void rotate(int[] nums, int k) {
        Queue<Integer> setOfNumbers = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            setOfNumbers.add(nums[i]);
        }
        for (int i = k; i < nums.length + k; i++) {
            nums[i % nums.length] = setOfNumbers.poll();
        }
    }
}