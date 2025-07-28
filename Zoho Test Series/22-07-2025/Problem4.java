import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if(num > 99999) System.out.print("Sorry Invalid");
        else {
            String result = "";
            int arr[] = new int[5];
            int id = 4;
            while(num > 0) {
                int rem = num % 10;
                arr[id--] = rem;
                num /= 10;
            }

            for(int i=0;i<5;i++) {
                // Special Case
                if((i == 0 || i == 3)) {
                    // Tens area (danger)
                    if(arr[i] == 1) {
                        result += oneTensName((arr[i]*10)+arr[i+1]);
                        if(i == 0) result += " thousand and ";
                        i++;
                    }
                    else result += tensInName(arr[i]);
                } else {
                    result += onesInName(arr[i]);
                }

                // Thousand or Hundred declaring 
                if(i == 1 && arr[i] != 0) result += " thousand and ";
                if(i == 2 && arr[i] != 0) result += " hundred and ";
                if(arr[i] != 0) result += " ";
            }

            System.out.println(result);
            sc.close();
        }
    }

    public static String onesInName(int num) {
        switch (num) {
                case 1: return "one";
                case 2: return "two";
                case 3: return "three";
                case 4: return "four";
                case 5: return "five";
                case 6: return "six";
                case 7: return "seven";
                case 8: return "eight";
                case 9: return "nine";
                default: return "";
        }
    }

    public static String oneTensName(int num) {
        switch (num) {
                case 10: return "ten";
                case 11: return "eleven";
                case 12: return "twelve";
                case 13: return "thirteen";
                case 14: return "fourteen";
                case 15: return "fifteen";
                case 16: return "sixteen";
                case 17: return "seventeen";
                case 18: return "eighteen";
                case 19: return "nineteen";
                default: return "";
        }
    }

    public static String tensInName(int num) {
        switch (num) {
                case 1: return "eleven";
                case 2: return "twenty";
                case 3: return "thirty";
                case 4: return "forty";
                case 5: return "fifty";
                case 6: return "sixty";
                case 7: return "seventy";
                case 8: return "eighty";
                case 9: return "ninety";
                default: return "";
        }
    }
}
