import java.util.*;

class ZigZag {
	static void printDiag(int[][] matrix, int bias) {
    	int m = matrix.length - 1; // last row index
    	int n = matrix[0].length - 1; // last col index

    	int i, j;

    	if (bias <= n) {
        	i = 0;
        	j = bias;
    	} else {
        	i = bias - n;
        	j = n;
    	}

    	ArrayList<Integer> diagonalElements = new ArrayList<>();

    	while (i <= m && j >= 0) {
        	diagonalElements.add(matrix[i][j]);
        	i++;
        	j--;
    	}

    	if (bias % 2 == 0) {
        	for (int val : diagonalElements) System.out.print(val + " ");
    	} else {
        	for (int k = diagonalElements.size() - 1; k >= 0; k--) System.out.print(diagonalElements.get(k) + " ");
        }
    }


	public static void main(String[] args){
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

		int m = matrix.length;
		int n = matrix[0].length;

		for(int i=0;i<m+n-1;i++){
			printDiag(matrix, i);
		}
	}
}