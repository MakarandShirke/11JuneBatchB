package Array;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		String ar[] = new String [5];  //Array declaration with 5
		
		ar[0] = "JAVA";
		ar[1] = "Automation";
		ar[2] = "Manual";
		ar[3] = "Selenium";
		ar[4] = "Postman";
		
	//	System.out.println(ar[1]);
		
		System.out.println("*******Print All Information in Array*********");
		
		for(int i =0; i<=4; i++) {
			
			System.out.println(ar[i]);
			
		}
		
		System.out.println("*****Reverse All Information in Array******");
		
		for(int i =4; i>=0; i--) {
			
			System.out.println(ar[i]);
			
		}
		
		System.out.println(ar[2]);
		
		
		
		
		
		
		
		
		
	}

}
