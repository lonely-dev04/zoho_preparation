public class ShortestPathFinder {
    public static int findMinPath(int i,int j, int[][] matrix,int count) {
        if(i == matrix.length - 1 && j == matrix.length - 1) return count+1;

        int minPath = Integer.MAX_VALUE;

        //North
        if(i-1 >= 0 && matrix[i-1][j] == 0) {
            System.out.println("Moved towards N "+count);
            matrix[i-1][j] = 1;
            minPath = Math.min(minPath, findMinPath(i-1, j, matrix, count+1));
            matrix[i-1][j] = 0;
        }

        //North - East
        if(i-1 >= 0 && j+1 < matrix[0].length && matrix[i-1][j+1] == 0) {
            System.out.println("Moved towards NE "+count);
            matrix[i-1][j+1] = 1;
            minPath = Math.min(minPath, findMinPath(i-1, j+1, matrix, count+1));
            matrix[i-1][j+1] = 0;
        }

        //East
        if(j+1 < matrix[0].length && matrix[i][j+1] == 0) {
            System.out.println("Moved towards E "+count);
            matrix[i][j+1] = 1;
            minPath = Math.min(minPath, findMinPath(i, j+1, matrix, count+1));
            matrix[i][j+1] = 0;
        }

        //South - East
        if(i+1 < matrix.length && j+1 < matrix[0].length && matrix[i+1][j+1] == 0) {
            System.out.println("Moved towards SE "+count);
            matrix[i+1][j+1] = 1;
            minPath = Math.min(minPath, findMinPath(i+1, j+1, matrix, count+1));
            matrix[i+1][j+1] = 0;
        }
        
        //South
        if(i+1 < matrix.length && matrix[i+1][j] == 0) {
            System.out.println("Moved towards S "+count);
            matrix[i+1][j] = 1;
            minPath = Math.min(minPath, findMinPath(i+1, j, matrix, count+1));
            matrix[i+1][j] = 0;
        }

        //South - West
        if(i+1 < matrix.length && j-1 >= 0 && matrix[i+1][j-1] == 0) {
            System.out.println("Moved towards SW "+count);
            matrix[i+1][j-1] = 1;
            minPath = Math.min(minPath, findMinPath(i+1, j-1, matrix, count+1));
            matrix[i+1][j-1] = 0;
        }

        //West
        if(j-1 >= 0 && matrix[i][j-1] == 0) {
            System.out.println("Moved towards W "+count);
            matrix[i][j-1] = 1;
            minPath = Math.min(minPath, findMinPath(i, j-1, matrix, count+1));
            matrix[i][j-1] = 0;
        }

        //North - West
        if(i-1 >= 0 && j-1 >= 0 && matrix[i-1][j-1] == 0) {
            System.out.println("Moved towards NW "+count);
            matrix[i-1][j-1] = 1;
            minPath = Math.min(minPath, findMinPath(i-1, j-1, matrix, count+1));
            matrix[i-1][j-1] = 0;
        }

        return minPath;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}
        };
        int mixPath = findMinPath(0, 0, matrix, 0);
        System.out.println(mixPath);
    }

    /* int[][] matrix = {
            {0,0,0,0,0,0,0,0},
            {0,0,1,0,0,0,0,1},
            {1,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,0},
            {0,0,1,0,1,0,1,1},
            {0,0,0,0,0,0,0,0},
            {0,0,0,1,1,1,0,0},
            {1,0,1,1,1,0,0,0}
        }; */
}