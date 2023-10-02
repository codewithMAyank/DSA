package backtracking;

//row locked

public class nqueens {
    public static boolean isitsafe(char board[][], int row, int col) {
        //check for column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        //check for left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //check for right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return false;
    }

    public static void nqueensrows(char board[][],int row) {
        //base case
        if (row == board.length) {
            printBoard(board);
            //print board
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isitsafe(board, row, col)) {
                board[row][col] = 'Q';
                nqueensrows(board, row + 1);
                board[row][col] = '.';
            }
        }
        
    }
    public static void printBoard(char board[][] ) {
        System.out.println("----------chess----------");
        for (int i=0; i<board.length;i++){
            for (int j=0; j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        int n = 2;
        char[][] board = new char[n][n];
        //initialize with khalipan
        for (int i=0; i<n;i++){
            for (int j=0; j<n;j++){
                board[i][j] = '.';
            }
        }

        nqueensrows(board, 0);
    }
}
