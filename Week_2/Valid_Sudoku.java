public class Valid_Sudoku {
    public static void main(String[] args) {
        String[][] sArr = { { "5", "3", ".", ".", "7", ".", ".", ".", "." },
                { "6", ".", ".", "1", "9", "5", ".", ".", "." }, { ".", "9", "8", ".", ".", ".", ".", "6", "." },
                { "8", ".", ".", ".", "6", ".", ".", ".", "3" }, { "4", ".", ".", "8", ".", "3", ".", ".", "1" },
                { "7", ".", ".", ".", "2", ".", ".", ".", "6" }, { ".", "6", ".", ".", ".", ".", "2", "8", "." },
                { ".", ".", ".", "4", "1", "9", ".", ".", "5" }, { ".", ".", ".", ".", "8", ".", ".", "7", "9" } };
        char[][] cArr = get2DArray(sArr);
        printSudoku(cArr);
        System.out.println(isValidSudoku(cArr));
    }

    public static void printSudoku(char[][] cArr) {
        System.out.print("   ");
        for (int i = 0; i < cArr.length; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < cArr.length; i++) {
            System.out.printf("%3d", count++);
            for (int j = 0; j < cArr[i].length; j++) {
                System.out.printf("%3c", cArr[i][j]);
            }
            System.out.println();
        }
    }

    public static char[][] get2DArray(String[][] myArray) {
        char[][] cArr = new char[myArray.length][myArray[0].length];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                cArr[i][j] = myArray[i][j].charAt(0);
            }
        }
        return cArr;
    }

    public static boolean isValidSudoku(char[][] board) {
        char[][] cubes = new char[9][9];
        // 0 1 2
        // 3 4 5
        // 6 7 8
        char[][] horizontal = new char[9][9];
        // 0
        // 1
        // 2
        // 3
        // 4
        // 5
        // 6
        // 7
        // 8
        char[][] verticals = new char[9][9];
        // 0 1 2 3 4 5 6 7 8
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] != '.') {
                    int cubeIndex = getCubeIndex(i, j);
                    char[] insideCube = cubes[cubeIndex];
                    char[] insideHorizontal = horizontal[i];
                    char[] insideVerticals = verticals[j];

                    if (insideCube[board[i][j] - 49] != 0) {
                        return false;
                    } else {
                        insideCube[board[i][j] - 49] = board[i][j];
                    }
                    if (insideHorizontal[board[i][j] - 49] != 0) {
                        return false;
                    } else {
                        insideHorizontal[board[i][j] - 49] = board[i][j];
                    }
                    if (insideVerticals[board[i][j] - 49] != 0) {
                        return false;
                    } else {
                        insideVerticals[board[i][j] - 49] = board[i][j];
                    }
                }

            }
        }
        return true;
    }

    public static int getCubeIndex(int i, int j) {
        if (i < 3) {
            if (j < 3) {
                return 0;
            } else if (j < 6) {
                return 1;
            } else {
                return 2;
            }
        } else if (i < 6) {
            if (j < 3) {
                return 3;
            } else if (j < 6) {
                return 4;
            } else {
                return 5;
            }
        } else {
            if (j < 3) {
                return 6;
            } else if (j < 6) {
                return 7;
            } else {
                return 8;
            }
        }
    }

}