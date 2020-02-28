import java.util.*;

public class Merge_Intervals {
    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> listOfIntervals = new LinkedList<int[]>();

        // Sort the 2d array by the last number
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] obj1, int[] obj2) {
                if (obj1[0] > obj2[0])
                    return 1;
                else
                    return -1;
            }
        });
        /**
         * 1 3 2 6 8 10 15 18
         * 
         */
        int pointer = 0;
        while (pointer < intervals.length) {
            boolean done = false;
            int endTime = intervals[pointer][1];
            int nextValidIndex = pointer + 1;
            while (nextValidIndex < intervals.length && !done) {
                int startTime = intervals[nextValidIndex][0];
                if (endTime >= startTime) {
                    nextValidIndex++;
                } else {
                    done = true;
                }
            }
            nextValidIndex--;
            int[] aSolution = { intervals[pointer][0], intervals[nextValidIndex][1] };
            listOfIntervals.add(aSolution);
            pointer = nextValidIndex + 1;
        }
        int[][] mySolution = new int[listOfIntervals.size()][2];
        for (int i = 0; i < mySolution.length; i++) {
            mySolution[i] = listOfIntervals.get(i);
        }
        return mySolution;

    }

}