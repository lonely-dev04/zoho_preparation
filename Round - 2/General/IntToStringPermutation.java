public class IntToStringPermutation {
	public static String seperateNums(int num) {
		String result = "";
		while(num > 0) {
			int rem = num % 10;
			result = (char)(rem + 96)+" "+result;
			num /= 10;
		}
		return result;
	}

	public static void process(int num) {
		String result = seperateNums(num);
		System.out.println(result);
		char[] array = result.toCharArray();

		// First Pass
		for(int i=0;i<array.length-1;i++) {
			int j = 0;
			while(j<array.length) {
				if(i == j) {
					int n1 = (int)(array[i] - 'a') + 1;
					int n2 = (int)(array[j] - 'a') + 1;
					int n3 = n1 + n2;
					if(n3 >= 1 & n3 <= 26) {
						char ch = (char)n3;
						System.out.print(ch+" ");
					}
					j++;
				} else {
					System.out.print(array[j]+" ");
				}
				j++;
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		int num = 1123;
		process(num);
	}
}