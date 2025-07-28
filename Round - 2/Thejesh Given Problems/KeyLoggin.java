import java.util.Scanner;

public class KeyLoggin {
    public static void getAkeyCount(String[] arr) {
        int ACount = 0;
        boolean isCopy = false;
        int allBuffer = 0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i].equals("A")) {
                ACount++;
                if(!isCopy) allBuffer = 0;
            }

            if(arr[i].equals("Ctrl") && i+1 < arr.length) {
                String next = arr[i+1];
                if(next.equals("A")) { allBuffer = ACount; i++;}
                if(next.equals("C")) {isCopy = true; i++;}
                if(next.equals("V") && isCopy) {ACount += allBuffer; i++;}
            }
        }
        System.out.println("The ACount: "+ACount);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        String[] keyPresses = temp.split(" ");
        getAkeyCount(keyPresses);
    }
}
