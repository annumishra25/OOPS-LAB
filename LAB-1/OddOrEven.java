import java.util.Scanner;
class OddOrEven{
public static void main(String args[]){
Scanner input = new Scanner (System.in);
System.out.print("Enter the number to check if its even or odd:");
int n = input.nextInt();
if (n%2==0){
System.out.println(n+" is Even.");}
else{
System.out.println(n+" is Odd.");}
}}