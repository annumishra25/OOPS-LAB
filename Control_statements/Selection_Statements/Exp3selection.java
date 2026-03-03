import java.util.*;
public class Exp3selection{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("even or odd");
		System.out.print("Enter a number: ");
		int a=sc.nextInt();
		String n=(a%2==0)?"even":"odd";
		System.out.print("The number is: "+n);
		
	}
}