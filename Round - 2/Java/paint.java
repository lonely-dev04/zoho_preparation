import java.util.*;

class Paint{
	public static void main(String[] args){
		int[][] screen = {{1, 1, 1, 1, 1, 1, 1, 1},
                      	 {1, 1, 1, 1, 1, 1, 0, 0},
                         {1, 0, 0, 1, 1, 0, 1, 1},
                      	 {1, 2, 2, 2, 2, 0, 1, 0},
                         {1, 1, 1, 2, 2, 0, 1, 0},
                         {1, 1, 1, 2, 2, 2, 2, 0},
                      	 {1, 1, 1, 1, 1, 2, 1, 1},
                      	 {1, 1, 1, 1, 1, 2, 2, 1},
                         };

        int m = screen.length;
        int n = screen[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        System.out.print("Enter change: ");
        int change = sc.nextInt();

        int toChange = screen[x][y];

        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
        		if(screen[i][j] == toChange) screen[i][j] = change;
        		System.out.print(screen[i][j]);
        	}
        	System.out.println("");
        }

	}
}