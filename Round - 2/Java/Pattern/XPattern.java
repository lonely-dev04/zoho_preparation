import java.util.*;

public class XPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int space = (str.length() - 1)/2;
		int sideSpace = 0;
		boolean rev = true;

		for(int i=0;i<str.length();i++) {
			for(int j=0;j<sideSpace;j++) System.out.print(" ");
			if(space == 0) {
			  System.out.print(str.charAt(i)+"\n");
			  rev = false;
			} else {
				System.out.print(str.charAt(i));
				for(int j=0;j<space*2;j++) System.out.print(" ");
				System.out.print(str.charAt(i)+"\n");
			}
			//Space Logic
			if(rev) {
				sideSpace++;
				space--;
			}
			else {
				sideSpace--;
				space++;
			}
		}
	}
}