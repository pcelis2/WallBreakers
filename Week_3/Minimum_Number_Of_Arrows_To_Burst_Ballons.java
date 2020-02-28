import java.util.*;

public class Minimum_Number_Of_Arrows_To_Burst_Ballons {

    public static void main(String[] args) {

    }

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0)
            return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] first, int[] second) {
                if (first[0] == second[0])
                    return 0;
                else if (first[0] < second[0])
                    return -1;
                else
                    return 1;
            }
        });

        for (int[] aList : points) {
            for (int i : aList) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        int currentMaxEnd = points[0][1];
        int arrowsNeeded = 0;
        for (int i = 0; i < points.length; i++) {
            // int currentStart = points

        }
        return arrowsNeeded;
    }
}