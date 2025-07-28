import java.util.*;
import java.math.*;

class StrMatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1, str2;

		str1 = sc.nextLine();
		str2 = sc.nextLine();

		ArrayList<Integer> matchArr = new ArrayList();

		for(int i=0;i<str2.length();i++) {
			for(int j=0;j<str1.length();j++) {
				if(str2.charAt(i) == str1.charAt(j)) {
					matchArr.add(j);
					break;
				}
			}
		}

		int max = Collections.max(matchArr);
		int min = Collections.min(matchArr);

		System.out.println("Output: "+str1.substring(min,max+1));
	}
}