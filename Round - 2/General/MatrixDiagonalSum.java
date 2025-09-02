public class MatrixDiagonalSum {
    public static int returnTopBottomSum(int[][] matrix) {
        int up = 0;
        int down = 0;
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                if(i+j < matrix.length) {
                    up += matrix[i][j];
                }
                if(i+j >= matrix.length-1) {
                    down += matrix[i][j];
                }
            }
        }
        return Math.max(up, down);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int result = returnTopBottomSum(matrix);
        System.out.println("The Max Diagonal Sum: "+result);
    }
}