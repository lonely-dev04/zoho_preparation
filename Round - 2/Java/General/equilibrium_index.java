import java.util.*;

class EquilibriumIndex {
	public static void main(String[] args){
		int[] arr = {-7, 1, 5, 2, -4, 3, 0};
		int ln = arr.length;
		int totSum = 0, curSum = 0,chk =0;

		for(int i=0;i<ln;i++) totSum += arr[i];

		System.out.println("Total Sum: "+totSum);
		for(int i=0;i<ln;i++){
			if(curSum == totSum - curSum - arr[i]){
				System.out.println("Equilibrium Index: " + i);
				chk = 1;
				break;
			}
			curSum += arr[i];
		}
		if(chk == 0){
			System.out.println("-1");
		}
	}
}