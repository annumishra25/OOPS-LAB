import java.util.*;
public class Switchcase2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Course faculty");
		System.out.print("Enter Course code: ");
		String a=sc.next();
		switch(a){
			case "23ADM111":System.out.println("Your course faculty is Ayanthika mam");
					break;
			case "23CSE111":System.out.println("Your course faculty is Suthir sir");
					break;
			case "23CSE113":System.out.println("Your course faculty is Nivethitha mam");
					break;
			case "23MAT116":System.out.println("Your course faculty is Kiruthika mam");
					break;
			case "23MAT117":System.out.println("Your course faculty is Swetha mam");
					break;
			case "23ENG101":System.out.println("Your course faculty is Jayalakshmi mam");
					break;
			case "23MEE115":System.out.println("Your course faculty is Vignesh sir");
					break;
			case "23PHY115":System.out.println("Your course faculty is Kushbu Das mam");
					break;
			default:System.out.println("Your class advisor is Natrajan sir");

		}
	}

}
