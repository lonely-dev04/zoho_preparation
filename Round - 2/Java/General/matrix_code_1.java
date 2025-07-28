import java.util.*;

class Main {
	public static void main(String[] args){
		int[][] matrix = {
    		{1, 0, 1},
    		{0, 1, 0},
    		{1, 1, 1}
		};

		int n = matrix.length;
		int m = matrix[0].length;

		ArrayList<String> onesList = new ArrayList<>();
		ArrayList<String> toZeroList = new ArrayList<>();

		// Step 1: Record all positions with 1
		for (int i = 0; i < n; i++) {
    		for (int j = 0; j < m; j++) {
        		if (matrix[i][j] == 1) onesList.add(i + "," + j);
    		}
		}

		// Step 2: Mark adjacent cells of 1s to be zeroed
		for (String pos : onesList) {
    		String[] parts = pos.split(",");
    		int i = Integer.parseInt(parts[0]);
    		int j = Integer.parseInt(parts[1]);

    		// up
    		if (i - 1 >= 0) toZeroList.add((i - 1) + "," + j);
    		// down
    		if (i + 1 < n) toZeroList.add((i + 1) + "," + j);
    		// left
    		if (j - 1 >= 0) toZeroList.add(i + "," + (j - 1));
    		// right
    		if (j + 1 < m) toZeroList.add(i + "," + (j + 1));
		}

		// Step 3: Modify the matrix
		for (String pos : toZeroList) {
    		String[] parts = pos.split(",");
    		int i = Integer.parseInt(parts[0]);
    		int j = Integer.parseInt(parts[1]);
    		matrix[i][j] = 0;
		}

		// Step 4: Print final matrix
		for (int i = 0; i < n; i++) {
    		for (int j = 0; j < m; j++) System.out.print(matrix[i][j] + " ");
    		System.out.println();
		}
}
}