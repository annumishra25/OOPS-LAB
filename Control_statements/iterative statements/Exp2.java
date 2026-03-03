import java.util.Scanner;

public class Exp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, rev = 0;

        do {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        } while(temp != 0);

        if(n == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}