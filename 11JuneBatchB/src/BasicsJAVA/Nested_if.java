package BasicsJAVA;

public class Nested_if {
	public static void main(String[] args) {
		
		String UN = "MAK";
		String PWD = "Mak@123";
		
		if (UN == "MAK") {
			
			System.out.println("username is correct");
			
			if (PWD == "Mak@12") {
				
				System.out.println("password is correct");
				System.out.println("Login get successful");
				
			}
			
			else {
				System.out.println("password is incorrect");
				System.out.println("Login unsuccessful");
			}
				
		}
		else {
			
			System.out.println("password is wrong");
			System.out.println("Login unsuccessful");
		}
		
		
		
		
		
		
		
		
		
		
	}
}