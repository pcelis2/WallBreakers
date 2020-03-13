import java.util.*;

public class Word_Search {
    public static void main(String[] args) {
        Word_Search myProg = new Word_Search();
        // char[][] test2 = { { 'C', 'A', 'A' }, { 'A', 'A', 'A' }, { 'B', 'C', 'D' } };
        // System.out.println(myProg.exist(test2, "AAB"));

        char[][] test3 = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'E', 'S' }, { 'A', 'D', 'E', 'E' } };
        System.out.println(myProg.exist(test3, "ABCEFSADEESE"));
        System.exit(0);
    }

    public boolean exist(char[][] board, String word) {
        boolean[][] whereBeen = new boolean[board.length][];
        for (int i = 0; i < whereBeen.length; i++)
            whereBeen[i] = new boolean[board[i].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (found(board, whereBeen, word, 0, i, j))
                    return true;
            }
        }
        return false;

    }

    public boolean found(char[][] board, boolean[][] whereBeen, String word, int index, int rowLocation,
            int colLocation) {
        if (index == word.length())
            return true;
        if (rowLocation >= board.length)
            return false;
        if (rowLocation < 0)
            return false;
        if (colLocation >= board[rowLocation].length)
            return false;
        if (colLocation < 0)
            return false;
        if (whereBeen[rowLocation][colLocation])
            return false;
        if (board[rowLocation][colLocation] == word.charAt(index)) {
            whereBeen[rowLocation][colLocation] = true;
            if (found(board, whereBeen, word, index + 1, rowLocation + 1, colLocation)
                    || found(board, whereBeen, word, index + 1, rowLocation, colLocation + 1)
                    || found(board, whereBeen, word, index + 1, rowLocation - 1, colLocation)
                    || found(board, whereBeen, word, index + 1, rowLocation, colLocation - 1)) {
                return true;
            } else {
                whereBeen[rowLocation][colLocation] = false;
                return false;
            }
        } else {
            return false;
        }

    }
}