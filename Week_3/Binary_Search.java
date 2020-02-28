public class Binary_Search {
    public static void main(String[] args) {
        int[] myArr = { -1, 0, 3, 5, 9, 12 };
        int target = 2;
        Binary_Search myProgram = new Binary_Search();
        System.out.println(myProgram.search(myArr, target));
    }

    // Given a sorted (in ascending order) integer array nums of n elements
    // and a target value, write a function to search target in nums. If
    // target exists, then return its index, otherwise return -1.
    public int search(int[] nums, int target) {
        int leftBound = 0;
        int rightBound = nums.length - 1;
        while (leftBound < rightBound) {
            int mid = (leftBound + rightBound) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target) {
                leftBound = mid + 1;
            } else {
                rightBound = mid - 1;
            }

        }
        return -1;
    }
}