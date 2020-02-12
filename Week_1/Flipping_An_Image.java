public class Flipping_An_Image {
    public static void main(String[] args) {
        int[][] A = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        print2DArray(A);
        System.out.println();
        print2DArray(flipAndInvertImage(A));
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int[][] myArray = new int[A.length][];
        for (int i = 0; i < A.length; i++)
            myArray[i] = new int[A[i].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.println(i + ", " + (A.length - 1 - j));
                // System.out.println(A.length - 1 - j);
                myArray[i][A.length - 1 - j] = A[i][j];
                if (myArray[i][A.length - 1 - j] == 0) {
                    myArray[i][A.length - 1 - j] = 1;
                } else {
                    myArray[i][A.length - 1 - j] = 0;
                }
            }
        }
        return myArray;
    }

    public static void print2DArray(int[][] myArray) {
        System.out.print("[");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("[");
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]);
                if (j < myArray[i].length - 1)
                    System.out.print(", ");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }
}