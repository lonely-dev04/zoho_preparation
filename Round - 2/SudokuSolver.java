public class SudokuSolver {
    final static int N = 9;

    public static boolean isValid(char[][] board, int row, int col, char ch) {
        // Row and Col Checking
        for(int i=0;i<N;i++) {
            if(board[row][i] == ch) return false;
            if(board[i][col] == ch) return false;
        }

        // Box Checking
        //Getting the start index of sub box
        int stRow = (row/3)*3;
        int stCol = (col/3)*3;
        // Interating through
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(board[i+stRow][j+stCol] == ch) return false;
            }
        }

        return true;
    }

    public static boolean solveSudoku(char[][] board) {
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(board[i][j] == '.') {
                    // Now Recursive Part
                    for(char ch='1';ch<='9';ch++) {
                        if(isValid(board, i, j, ch)) {
                            board[i][j] = ch;
                            if(solveSudoku(board)) { // Key Recursion
                                return true;
                            }
                            board[i][j] = '.'; // Reverting
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static void printBoard(char[][] board) {
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        solveSudoku(board);
        printBoard(board);
    }
}