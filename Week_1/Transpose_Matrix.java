public class Transpose_Matrix {
    public static void main(String[] args) {

    }

    public static int[][] transpose(int[][] A) {
        int[][] myArray = new int[A[0].length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                myArray[j][i] = A[i][j];
            }
        }
        return myArray;
    }
}