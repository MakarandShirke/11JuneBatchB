package String;

public class Palindrome {
	
	
 public static void main(String[] args) {
	 
	 String a = "MOM";   
	 
	 String rev = "";
	 
	 for (int i = a.length()-1; i>=0; i--) {
		 
		 rev = rev + a.charAt(i);
	 }
	 
	 System.out.println(rev);
	 
	 if(a.equals(rev)) {
		 
		 System.out.println("Palindrome Number");
	 }
	 
	 else {
		 
		 System.out.println("Not a Palindrome Number");
	 }
		
		
		
		
		
		
		
		
		
		
	}
}
