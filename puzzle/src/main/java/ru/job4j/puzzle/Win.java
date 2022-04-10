package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkRaw(board, i) || checkColumn(board, i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkRaw(int[][] board, int raw)
    {
        for (int i : board[raw]) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkColumn(int[][] board, int column)
    {
        for (int[] ints : board) {
            if (ints[column] == 0) {
                return false;
            }
        }
        return true;
    }
}
