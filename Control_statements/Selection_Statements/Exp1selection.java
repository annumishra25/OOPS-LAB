import java.util.*;
public class Exp1selection{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Driving liscence Eligibility");
		System.out.print("Enter your age: ");
		int a=sc.nextInt();
		System.out.print("Did you pass your driving exam(true/false): ");
		boolean b=sc.nextBoolean();
		if(a>=18 && b){
			System.out.println("you are Eligible for driving liscence");
		}else{
			System.out.println("you are NOT Eligible for driving liscence");
		}
	}
}