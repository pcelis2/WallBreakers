public class Sort_Array_By_Parity {
    public static void main(String[] args) {
        int[] A = { 3, 1, 2, 4 };
        sortArrayByParity(A);
        for (int i : A)
            System.out.print(i + " ");
    }

    public static int[] sortArrayByParity(int[] A) {
        int evenPointer = 0;
        int oddPointer = A.length - 1;
        int arrayPointer = 0;
        while (arrayPointer <= oddPointer) {
            if (A[arrayPointer] % 2 == 0) {
                A[evenPointer] = A[arrayPointer];
                evenPointer++;
                arrayPointer++;
            } else {
                int temp = A[oddPointer];
                A[oddPointer] = A[arrayPointer];
                A[arrayPointer] = temp;
                oddPointer--;
            }
        }
        return A;
    }
}