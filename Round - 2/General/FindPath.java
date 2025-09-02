public class FindPath {
    public static boolean process(int i, int j, int[][] matrix) {
        if(i == matrix.length-1 && j == matrix.length-1) {
            return true;
        }
        // Right
        if(i + 1 < matrix.length && matrix[i+1][j] == 1) {
            return process(i+1, j, matrix);
        }
        // Down
        if(j+1 < matrix.length && matrix[i][j+1] == 1) {
            return process(i, j+1, matrix);
        }

        return false;
    }


    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 1, 0, 0},
            {1, 1, 1, 1, 1},
            {0, 0, 0, 1, 0},
            {1, 0, 1, 1, 1},
            {0, 1, 1, 0, 1}
        };
        System.out.println(process(0, 0, matrix));
    }
}