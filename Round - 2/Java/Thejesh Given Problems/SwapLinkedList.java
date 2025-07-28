import java.util.Scanner;

class LinkedList {
    class Node {
        int data;
        Node next;
    }

    Node head;

    LinkedList(int[] arr) {
        this.head = createLinkedList(arr);
    }

    // Core Logic here
    public void swapTheNodes() {
        Node temp = head;

        while (temp != null && temp.next != null) {
            int t = temp.data;
            temp.data = temp.next.data;
            temp.next.data = t;
            temp = temp.next.next;
        }
    }

    public void display() {
        Node temp = this.head;
        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    private Node createLinkedList(int[] arr) {
        Node temp = new Node();
        Node thead = temp;
        temp.data = arr[0];
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node();
            newNode.data = arr[i];
            temp.next = newNode;
            temp = temp.next;
        }
        return thead;
    }
}

public class SwapLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        LinkedList ll = new LinkedList(arr);
        ll.swapTheNodes();
        ll.display();
        sc.close();
    }
}
