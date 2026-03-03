import java.util.*;
public class Robot{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter button num:");
        int x = sc.nextInt();
        if(x==1){
            System.out.println("Hellow");}
        else if(x==2){
            System.out.println("Namaste");}
        else {
            System.out.println("Bonjour");
        }
    }
    
}
