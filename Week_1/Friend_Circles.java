public class Friend_Circles {
    public static void main(String[] args) {
        int[][] M = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
        findCircleNum(M);
    }

    public static int findCircleNum(int[][] M) {
        int circles = 0;
        int[] peopleConnections = new int[M.length];
        for (int i = 0; i < peopleConnections.length; i++)
            peopleConnections[i] = -1;
        return circles;
        // int[] peopleFriends = new int[M.length];
        // for (int i = 0; i < peopleFriends.length; i++)
        // peopleFriends[i] = -1;

        // int cycles = 0;
        // for (int i = 0; i < M.length; i++) {
        // for (int j = 0; j < M[i].length; j++) {
        // // printArray(peopleFriends);
        // if (i != j && M[i][j] == 1) {
        // // System.out.printf("(%d, %d)\n", i, j);
        // // add some rack logic
        // if (peopleFriends[i] < 0 && peopleFriends[j] < 0) {
        // int tempRank = 0;
        // if (peopleFriends[i] < peopleFriends[j]) {
        // tempRank = peopleFriends[j];
        // peopleFriends[j] = i;
        // peopleFriends[i] += tempRank;
        // } else {
        // tempRank = peopleFriends[i];
        // peopleFriends[i] = j;
        // peopleFriends[j] += tempRank;
        // }
        // } else if (peopleFriends[i] < 0) {
        // /**
        // * make j a child of i
        // */
        // peopleFriends[j] = i;
        // peopleFriends[i]--;
        // } else if (peopleFriends[j] < 0) {
        // /**
        // * make i a child of j
        // */
        // peopleFriends[i] = j;
        // peopleFriends[j]--;
        // } else {
        // peopleFriends[j] = i;
        // }
        // }
        // }
        // }
        // // printArray(peopleFriends);
        // for (int I : peopleFriends) {
        // if (I < 0)
        // cycles++;
        // }
        // return cycles;
    }

    public static void printArray(int[] nums) {
        for (int I : nums) {
            System.out.print(I + " ");
        }
        System.out.println();
    }
}