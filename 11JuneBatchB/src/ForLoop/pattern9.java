package ForLoop;

public class pattern9 {
	
public static void main(String[] args) {
		
		int star = 9;
		int space =1;
		
		for (int i =1; i<=10; i++) {
			
			for(int j = 1; j<=space; j++) {
				
				System.out.print(" ");
			}
			
			for (int k=1; k<=star; k++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
           if(i<=9) {
				
				space++;
				star = star-2;
			}
			
			else {
				
				space--;
				star = star+2;
			}
			}
		
		
		
}

}
