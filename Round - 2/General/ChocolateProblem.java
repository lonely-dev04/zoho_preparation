import java.util.*;

class ChocolateProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int price = sc.nextInt();
		int wrappers = sc.nextInt();
		int maxVisit = sc.nextInt();

		money /= price;

		//1st Run
		int wrappersRemain = money % wrappers;
		int wrappersToCompute =  (money - wrappersRemain) / wrappers;
		int totalChocolate = money + wrappersToCompute;
		int wrappersLeftInHand = wrappersToCompute + wrappersRemain;

		//2nd Run Looping
		int i = 1;
		while(i < maxVisit || maxVisit == 0) {
			wrappersRemain = wrappersLeftInHand % wrappers;
			wrappersToCompute = (wrappersLeftInHand - wrappersRemain) / wrappers;
			totalChocolate += wrappersToCompute;
			wrappersLeftInHand = wrappersToCompute + wrappersRemain;
			if(wrappersLeftInHand < wrappers) break;
			i++;
		}

		System.out.println("totalChocolate: "+totalChocolate);
		System.out.println("wrappersLeftInHand: "+wrappersLeftInHand);
	}
}