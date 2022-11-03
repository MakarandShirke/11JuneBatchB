package Test;

public class PrimeNo {

	public static void main(String[] args) {
		
		int number = 5;
		int count = 0;
			
			for(int j =2; j<=number-1; j++) {
				
				if(number%j == 0) {
					count++;
				}
			}
			
			if (count == 0 ) {
				
				System.out.println("No is Prime no");
			}
			
			else {
				
				System.out.println("No is not Prime no");
		     }
     	}
				

	}

