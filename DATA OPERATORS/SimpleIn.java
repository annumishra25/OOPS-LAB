import java.util.*;
class SimpleIn{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("\t\t\t SIMPLE INTEREST CALCULATION");
System.out.println("Enter the principle amount:");
int p = input.nextInt();
System.out.println("Enter interest rate:");
int r = input.nextInt();
System.out.println("Enter the time period:");
int t = input.nextInt();
int simple = (p*r*t)/100;
System.out.println("simple interest is: "+simple);

}
}
