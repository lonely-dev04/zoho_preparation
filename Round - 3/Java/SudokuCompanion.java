class SudokuUtility {
	char[][] board;
	
	SudokuUtility(char[][] board) {
		this.board = board;
	}
	
	void printSudokuStats() {
		System.out.println("Sub Square Status\n"); // Sub Square Wise Printing
		serveIndexEachSquare(board);
		System.out.println("Row Wise Status\n"); // Row Wise Printing
		eachRowOrColPrint(board, true);
		System.out.println("\nColumn Wise Status\n"); // Col Wise Printing
		eachRowOrColPrint(board, false);
	}
	
	// Sub Square Printing
	void serveIndexEachSquare(char[][] board) {
        int m = 0;
        int n = 0;
        while(m < 9) {
            while(n < 9) {
                eachSquarePrint(board, m, m+2, n, n+2);
                n += 3;
            }
            n = 0;
            m += 3;
        }
    }

    void eachSquarePrint(char[][] board, int rowStart, int rowEnd, int colStart, int colEnd) {
        for(int i=rowStart;i<=rowEnd;i++) {
            for(int j=colStart;j<=colEnd;j++) System.out.print(board[i][j]+" ");
            System.out.println(" ");
        }
		System.out.println(" ");
    }
	
	// Row Wise Printing and Column Wise Printing
	void eachRowOrColPrint(char[][] board, boolean rev) {
		for(int i=0;i<9;i++) {
			if(rev) System.out.print("Row: "+i+"|");
			else System.out.print("Column: "+i+"|");
			for(int j=0;j<9;j++) {
				if(rev) System.out.print(" "+board[i][j]);
				else System.out.print(" "+board[j][i]);
			}
			System.out.println("|\n");
		}
	}
}


public class SudokuCompanion {
	public static void solveSudoku(char[][] board) {
        SudokuUtility sUtility = new SudokuUtility(board);
		sUtility.printSudokuStats();
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
	}
}
