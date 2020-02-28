public class Peak_Index_In_A_Mountain_Array {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] A) {
        if (A.length < 3)
            return -1;

        int leftBound = 0;
        int rightBound = A.length;
        while (leftBound <= rightBound) {
            int mid = (leftBound + rightBound) / 2;
            if (A[mid] < A[mid + 1]) {
                leftBound = mid + 1;
            } else if (A[mid] < A[mid - 1]) {
                rightBound = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}