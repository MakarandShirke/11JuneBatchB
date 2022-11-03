package String;

public class SpaceCounr {
	
public static void main(String[] args) {
		
		String a = "Pune is the best";
		int count = 0;  // count space from 0
		
		for(int i = 0; i<= a.length()-1; i++) {
			
			char b = a.charAt(i); // b taken as local variable to store character Index
			
			if(b == ' ') {
				
				count++;	
			}
			System.out.print(count);
		}

	}

	

}
