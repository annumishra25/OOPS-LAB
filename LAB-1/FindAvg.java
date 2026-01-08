import java.util.Scanner;
class FindAvg{
public static void main(String args[]){
Scanner annu = new Scanner(System.in);
System.out.print("Enter first number:");
int a = annu.nextInt();
System.out.println("Enter second number:");
int b = annu.nextInt();
System.out.println("Enter third number:");
int c = annu.nextInt();
double d = (a+b+c)/3.0;
System.out.println("Average of the numbers is: "+d);
}
}
