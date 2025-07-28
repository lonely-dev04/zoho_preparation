import java.util.*;

public class StringSeperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[n];
		for(int i=0;i<n;i++) arr[i] = sc.nextLine();

		for(int i=0;i<n;i++) {
			String temp = "";
			for(int j=0;j<arr[i].length();j++) {
				if(j % 2 == 0) System.out.print(arr[i].charAt(j));
				else temp += arr[i].charAt(j); 
			}
			System.out.print(" "+temp+"\n");
		}
	}
}