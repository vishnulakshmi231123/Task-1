package question;
import java.util.Scanner;
public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number a");
		int a = scan.nextInt();
		System.out.print("Enter the number b");
		int b = scan.nextInt();
		System.out.print("Enter the number c");
		int c = scan.nextInt();
		
		if(a<b && a<c ) {
			System.out.println("smallest num is +a");
		} else if (b<c) {
			System.out.println("smallest num is +b");
		} else {
			System.out.println("smallest num is +c");
		}
		System.out.println();		   
		
			

	}

}
