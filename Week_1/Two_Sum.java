import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = { 15, 7, 11, 2 };
        int target = 9;
        int[] solution = twoSum(nums, target);
        if (solution != null) {
            for (int i : solution) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> alreadyVisitSet = new HashMap<Integer, Integer>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int toFind = target - num;
            Integer indice = -1;

            indice = alreadyVisitSet.get(toFind);

            if (indice != null && indice >= 0) // we found what we were looking for
            {
                int[] solution = { indice, i };
                return solution;
            }
            alreadyVisitSet.put(nums[i], i);

        }

        return null;
    }
}