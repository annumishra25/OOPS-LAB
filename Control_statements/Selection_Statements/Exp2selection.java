import java.util.*;
public class Exp2selection{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Income Tax");
		System.out.print("Enter your salary: ");
		double a=sc.nextFloat();
		if(a>=10000000){
			System.out.println("you have to pay 30% tax");
			System.out.println("pay: "+(a-(a*0.30)));
		}else if(a<1000000 && a>500000){
			System.out.println("you have to pay 20% tax");
			System.out.println("pay: "+(a-(a*0.20)));
		}else if(a<500000 && a>100000){
			System.out.println("you have to pay 10% tax");
			System.out.println("pay: "+(a-(a*0.10)));
		}else{
			System.out.println("you dont have to pay tax");
			System.out.println("pay: "+0);
		}
	}
}