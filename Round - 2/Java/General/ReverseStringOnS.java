public class ReverseStringOnS {

	public static boolean match(String s1, String s2) {
		boolean flag = false;
		int id = 0;
		for(int i=0;i<s1.length();i++) {
			while(i < s1.length() && s1.charAt(i) == s2.charAt(id)) {
				i++;
				id++;
				if(id == s2.length()) return true;
			} 
		}
		return false;
	}


	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		String s1 = "na than da leo leo das";
		String s2 = "leo";

		int id = 0;
		boolean rev = false;
		int s2_id = 0;
		String[] arr = new String[s1.length()];
		String s = "";

		for(char ch: s1.toCharArray()) {
			if(ch == ' ' || ch == s1.charAt(s1.length() - 1)) {
				if(ch == s1.charAt(s1.length() - 1)) s+= ch;
				if(match(s, s2) && !(rev)) rev = true; // Reverse check logic
				if(rev) arr[id++] = s.trim();
				else System.out.print(s.trim()+" ");
				s = " ";
			} else {
				s += ch;
			}
		}
		id--;

		while(id >= 0) {
			System.out.print(arr[id--]+" ");
		}
	}
}