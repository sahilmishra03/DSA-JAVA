package Backtracking;

public class PS04 {
    static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        if (nQueens(board, 0)) {
            System.out.println("True");
            printBoard(board);
        } else {
            System.out.println("False");
        }
    }

    public static Boolean nQueens(char[][] board, int row) {
        // Base case
        if (row == board.length) {
            // Found a solution, return true without printing here
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true; // Stop after finding one valid solution
                }
                board[row][i] = 'X'; // Backtracking step
            }
        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("----------Chess Board----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diag left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diag right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
