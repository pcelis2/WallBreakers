import java.util.*;

public class Array_Partition_I {
    public static void main(String[] args) {

    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i] < nums[i + 1] ? nums[i] : nums[i + 1];
        }
        return sum;
    }
}