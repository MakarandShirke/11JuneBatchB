package ForLoop;

public class Pattern5 {
	
	public static void main(String[] args) {
		
		int star = 1;
		
		for(int i = 1; i<=9; i++) {
			
			for(int j =1; j<=star; j++) {
				
				System.out.print("*");
			}
			System.out.println();
			
			if(i<=4) {  // space = 4 as it, decreased 4 & increased by 
				
				star++;
			}
			
			else {
				
				star--;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
