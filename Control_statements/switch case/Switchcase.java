import java.util.Scanner;
public class Switchcase {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the button number");
        int x = sc.nextInt();
        switch(x){
            case 1: System.out.println("hellow");
            break;
            case 2: System.out.println("hola");
            break;
            case 33: System.out.println("bonjour");
            break;
            default: System.out.println("invalid button entered.");

        }
    }
    
    
}
