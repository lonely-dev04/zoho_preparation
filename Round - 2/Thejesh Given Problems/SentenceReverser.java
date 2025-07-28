import java.util.Scanner;

public class SentenceReverser {
    public static void reverseSentence(String[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine(); // one line of sentence
        String[] arr = line.split(" "); // split into words
        reverseSentence(arr);
    }
}
