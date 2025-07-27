package question;
import java.util.Scanner;
public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the price");
		int price = scan.nextInt();
			 
			if(price<500) {
				System.out.println("No discount");
				System.out.println("Total price="+price);
			} else if((price>=500) && (price<=1000)) {
				System.out.println("10% discount");
				price=price*90/100;
				System.out.println("Total price="+price);
			} else {
				System.out.println("20% Discount");
				price=price*80/100;
				System.out.println("Total price="+price);
				
			}
		

	}

}
