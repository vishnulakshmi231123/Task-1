package question;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int i,j,k;
		
		for( i = 1; i <= 5; i++) {
			for( j = 1; j <= 5; j++) {
				if (j<=i) {
					k = 6 -j;
				} else {
					k = 6 - i;
				}
				System.out.print(+k);
			  } 
			  System.out.println();
		}
			  
		 
	}

}
