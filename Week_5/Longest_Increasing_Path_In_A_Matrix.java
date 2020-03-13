import java.util.*;

public class Longest_Increasing_Path_In_A_Matrix {
    public static void main(String[] args) {

    }

    public int longestIncreasingPath(int[][] matrix) {
        boolean[][] whereBeen = get2DBooleanMap(matrix);
        int currentMax = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                int tempPathSize = currentLongestPath(matrix, whereBeen, Integer.MIN_VALUE, 0, i, j);
                if (tempPathSize > currentMax) {
                    currentMax = tempPathSize;

                }

            }
        }
        return currentMax;

    }

    public boolean[][] get2DBooleanMap(int[][] matrix) {
        boolean[][] whereBeen = new boolean[matrix.length][];
        for (int i = 0; i < whereBeen.length; i++)
            whereBeen[i] = new boolean[matrix[i].length];
        return whereBeen;
    }

    public int currentLongestPath(int[][] matrix, boolean[][] whereBeen, int previousValue, int currentMax,
            int verLocation, int horLocation) {
        if (verLocation >= matrix.length || verLocation < 0)
            return currentMax;
        if (horLocation >= matrix[verLocation].length || horLocation < 0)
            return currentMax;
        // if location already at location
        if (whereBeen[verLocation][horLocation])
            return currentMax;
        // if location is greater than previous value then currentMax ++
        if (previousValue < matrix[verLocation][horLocation]) {

            currentMax++;
        } else {
            return currentMax;
        }
        whereBeen[verLocation][horLocation] = true;
        int currentValue = matrix[verLocation][horLocation];

        int tempMax = Math.max(
                Math.max(currentLongestPath(matrix, whereBeen, currentValue, currentMax, verLocation + 1, horLocation),
                        currentLongestPath(matrix, whereBeen, currentValue, currentMax, verLocation, horLocation + 1)),
                Math.max(currentLongestPath(matrix, whereBeen, currentValue, currentMax, verLocation - 1, horLocation),
                        currentLongestPath(matrix, whereBeen, currentValue, currentMax, verLocation, horLocation - 1)));
        whereBeen[verLocation][horLocation] = false;
        return tempMax;

    }
}