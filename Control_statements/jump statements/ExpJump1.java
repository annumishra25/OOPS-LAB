import java.util.Scanner;

public class ExpJump1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        for(int i = 0; i < n; i++) {
            if(a[i] == key) {
                System.out.println("Element found at index " + i);
                break;
            }
        }
    }
}