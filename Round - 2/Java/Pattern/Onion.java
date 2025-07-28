
public class Onion {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int rowStart = 0, rowEnd = arr.length;
        int colStart = 0, colEnd = arr[0].length;

        while (rowStart < rowEnd && colStart < colEnd) {
            // Top Row (left - right) 
            for(int i=colStart;i<colEnd;i++) System.out.print(arr[rowStart][i]+" ");
            rowStart++;

            // Right Column (top - bottom)
            for(int i=rowStart;i<rowEnd;i++) System.out.print(arr[i][colEnd-1]+" ");
            colEnd--;

            // Bottom Row (right - left)
            for(int i=colEnd-1;i>=colStart;i--) System.out.print(arr[rowEnd-1][i]+" ");
            rowEnd--;

            // Left Column (bottom - top)
            for(int i=rowEnd-1;i>=rowStart;i--) System.out.print(arr[i][colStart]+" ");
            colStart++;
        }
    }    
}
