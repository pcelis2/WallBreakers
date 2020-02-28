public class House_Robber_II_Recur {
    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        /*
         * Base Case: IF neighbors OR already hit THEN return 0 ELSE RETURN MONEY +
         * nextHit(n+2) [a] [a, b] [a, b, c] [a, b, c, d] [a, b, c, d, e] a->c or d [a,
         * b, c, d, e, f] a -> {c, e} or {d}
         * 
         *
         */

        boolean[] homesRobbed = new boolean[nums.length];
        return hitHomes(nums, 0, nums.length - 1, homesRobbed); // return the max one

    }

    public int hitHomes(int[] nums, int start, int end, boolean[] homesRobbed) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        int max = 0;
        for (int i = 0; i < nums.length; i++)
            if(hitHomes(nums, start, end, homesRobbed))

        return 0;
    }
}