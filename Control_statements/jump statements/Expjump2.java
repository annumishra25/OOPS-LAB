import java.util.Scanner;

public class Expjump2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Positive numbers:");
        for(int i = 0; i < n; i++) {
            if(a[i] < 0) {
                continue;
            }
            System.out.print(a[i]+" ");
        }
    }
}