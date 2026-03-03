import java.util.*;
public class Datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character:");
        char a=sc.next().charAt(0);
        System.out.print("Enter integer:");
        int b=sc.nextInt();
        System.out.print("Enter float:");
        float c=sc.nextFloat();
        System.out.print("Enter double:");
        double d=sc.nextDouble();
        System.out.print("Enter string:");
        String e=sc.next();
        System.out.println("Character: "+a);
        System.out.println("Integer: "+b);
        System.out.println("Float: "+c);
        System.out.println("Double: "+d);
        System.out.println("String: "+e);
        sc.close();
    }    
}