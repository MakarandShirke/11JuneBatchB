package String;

public class Factorial {

	public static void main(String[] args) {
		
		//Print Factorial 5 i.e 5!    // 5*4*3*2*1 = 120
		
		int a =5;
		
		int factorial = 1;
		
		for(int i = 5; i>=1; i--) {
			
		
			factorial = factorial*i;
			
		}
		
		System.out.println(factorial);

	}

}
