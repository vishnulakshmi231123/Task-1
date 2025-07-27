package question;
import java.util.Scanner;
public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number");
		int x = scan.nextInt();
		  
			int rev = 0;
			while( x>0 ) {
				rev = rev * 10 + x % 10;
				x/=10;
			}
			System.out.println(+rev);
			
			

	}

}
